package budgetbuddy;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class viewExpenses extends javax.swing.JFrame {

    private final ExpenseManager manager;

    public viewExpenses() {
        initComponents();

        manager = ExpenseManager.getInstance(); // initialize manager
        refreshHistory(manager.getAllExpenses()); // default: show all expenses by date
    }

    private void refreshHistory(List<Expense> expenses) {
        historyOfExpenses.removeAll();
        historyOfExpenses.setLayout(new BoxLayout(historyOfExpenses, BoxLayout.Y_AXIS));

        for (Expense e : expenses) {
            JPanel item = new JPanel();
            item.setLayout(new GridLayout(1, 4));
            item.add(new JLabel(e.getDateString()));
            item.add(new JLabel(e.getCategory()));
            item.add(new JLabel(String.format("₱%.2f", e.getAmount())));
            item.add(new JLabel(e.getNotes()));
            item.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));

            historyOfExpenses.add(item);
        }

        historyOfExpenses.revalidate();
        historyOfExpenses.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        searchBar = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        sortBy = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        historyOfExpenses = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(106, 212, 177));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brand.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 28, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchBar.setPreferredSize(new java.awt.Dimension(64, 37));
        jPanel2.add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 440, 30));

        searchButton.setBackground(new java.awt.Color(106, 212, 177));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel2.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 40, 30));

        sortBy.setBackground(new java.awt.Color(106, 212, 177));
        sortBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "Amount", "Category" }));
        sortBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByActionPerformed(evt);
            }
        });
        jPanel2.add(sortBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, 30));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(31, 60, 136));
        jLabel3.setText("HISTORY: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, -1));

        returnButton.setBackground(new java.awt.Color(106, 212, 177));
        returnButton.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        returnButton.setForeground(new java.awt.Color(31, 60, 136));
        returnButton.setText("BACK");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        jPanel2.add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, -1, -1));

        historyOfExpenses.setLayout(new javax.swing.BoxLayout(historyOfExpenses, javax.swing.BoxLayout.LINE_AXIS));
        jPanel2.add(historyOfExpenses, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 680, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String query = searchBar.getText().trim();
        List<Expense> results;

        if (query.isEmpty()) {
            results = manager.getAllExpenses(); // show all if empty
        } else {
            results = manager.linearSearch(query); // perform linear search
        }

        refreshHistory(results);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void sortByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByActionPerformed
        String mode = (String) sortBy.getSelectedItem();
        manager.bubbleSortBy(mode.toLowerCase()); // "date", "amount", "category"
        refreshHistory(manager.getAllExpenses());
    }//GEN-LAST:event_sortByActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        this.dispose();
        DashBoard dash = new DashBoard();
        dash.setVisible(true);
    }//GEN-LAST:event_returnButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new viewExpenses().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel historyOfExpenses;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton returnButton;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> sortBy;
    // End of variables declaration//GEN-END:variables
}
