package budgetbuddy;

import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.DefaultTableModel;

public class monthlySummary extends javax.swing.JFrame {

    public monthlySummary() {
        initComponents();

        tableMonthlySummary.setShowGrid(true);
        tableMonthlySummary.setGridColor(new java.awt.Color(106, 212, 177));
        tableMonthlySummary.setIntercellSpacing(new java.awt.Dimension(1, 8));
        tableMonthlySummary.setRowHeight(28);

        // HEADER FIX
        JTableHeader header = tableMonthlySummary.getTableHeader();
        header.setFont(new java.awt.Font("Corbel", java.awt.Font.BOLD, 24));
        header.setBackground(new java.awt.Color(106, 212, 177));
        header.setForeground(new java.awt.Color(0, 0, 0));
        header.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new java.awt.Color(106, 212, 177));
        headerRenderer.setForeground(new java.awt.Color(0, 0, 0));
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < tableMonthlySummary.getColumnModel().getColumnCount(); i++) {
            tableMonthlySummary.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        populateMonthlyTotals();
    }
    
    private void populateMonthlyTotals() {
        DefaultTableModel model = (DefaultTableModel) tableMonthlySummary.getModel();
        ExpenseManager manager = ExpenseManager.getInstance(); // ADDED

        List<ExpenseManager.MonthTotal> monthlyTotals = manager.getMonthlyTotalsList(); // ADDED

        for (int row = 0; row < model.getRowCount(); row++) {
            String monthName = model.getValueAt(row, 0).toString().toUpperCase();
            double total = 0.0;

            // match with ExpenseManager.MonthTotal
            for (ExpenseManager.MonthTotal mt : monthlyTotals) {
                if (mt.monthName().equals(monthName)) {
                    total = mt.total;
                    break;
                }
            }
            model.setValueAt(total, row, 1);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        returnBn2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMonthlySummary = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(106, 212, 177));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brand.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        returnBn2.setBackground(new java.awt.Color(106, 212, 177));
        returnBn2.setText("Back");
        returnBn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBn2ActionPerformed(evt);
            }
        });

        tableMonthlySummary.setAutoCreateRowSorter(true);
        tableMonthlySummary.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        tableMonthlySummary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"January", ""},
                {"February", null},
                {"March", null},
                {"April", null},
                {"May", null},
                {"June", null},
                {"July", null},
                {"August", null},
                {"September", null},
                {"October", null},
                {"November", null},
                {"December", null}
            },
            new String [] {
                "Month", "Total Amount"
            }
        ));
        jScrollPane1.setViewportView(tableMonthlySummary);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(returnBn2)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(returnBn2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnBn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBn2ActionPerformed
        this.dispose(); // close current window
        new DashBoard().setVisible(true); // open dashboard
    }//GEN-LAST:event_returnBn2ActionPerformed

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
            java.util.logging.Logger.getLogger(monthlySummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(monthlySummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(monthlySummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(monthlySummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new monthlySummary().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton returnBn2;
    private javax.swing.JTable tableMonthlySummary;
    // End of variables declaration//GEN-END:variables
}
