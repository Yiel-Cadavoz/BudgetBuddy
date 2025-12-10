/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package budgetbuddy;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class categorySummary extends javax.swing.JFrame {

    private final String username;
    
    public categorySummary(String username) {
        this.username = username;
        initComponents();

        tableCategorySummary.setShowGrid(true);
        tableCategorySummary.setGridColor(new java.awt.Color(106, 212, 177)); // mint green
        tableCategorySummary.setIntercellSpacing(new java.awt.Dimension(1, 8));
        tableCategorySummary.setRowHeight(28);

        // HEADER FIX
        JTableHeader header = tableCategorySummary.getTableHeader();
        header.setFont(new java.awt.Font("Corbel", java.awt.Font.BOLD, 24));
        header.setBackground(new java.awt.Color(106, 212, 177));
        header.setForeground(new java.awt.Color(0, 0, 0));
        header.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        header.setFont(new java.awt.Font("Corbel", java.awt.Font.BOLD, 24));
        headerRenderer.setBackground(new java.awt.Color(106, 212, 177));  // your mint color
        headerRenderer.setForeground(new java.awt.Color(0, 0, 0));        // black text
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);   // optional

        for (int i = 0; i < tableCategorySummary.getColumnModel().getColumnCount(); i++) {
            tableCategorySummary.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }

        populateCategoryTotals();
    }

    private void populateCategoryTotals() {
        DefaultTableModel model = (DefaultTableModel) tableCategorySummary.getModel();
        ExpenseManager manager = ExpenseManager.getInstance(); // ADDED
        var categoryTotals = manager.getCategoryTotalsList(); // ADDED

        for (int row = 0; row < model.getRowCount(); row++) {
            String categoryName = model.getValueAt(row, 0).toString();
            double total = 0.0;

            for (ExpenseManager.CategoryTotal ct : categoryTotals) {
                if (ct.category.equalsIgnoreCase(categoryName)) {
                    total = ct.total;
                    break;
                }
            }
            model.setValueAt(total, row, 1); // set total amount in column 1
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        returnBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCategorySummary = tableCategorySummary = new javax.swing.JTable();
        tableCategorySummary.getTableHeader().setFont(new java.awt.Font("Corbel", java.awt.Font.BOLD, 24));

        ;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(106, 212, 177));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brand.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        returnBtn.setBackground(new java.awt.Color(106, 212, 177));
        returnBtn.setText("Back");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        tableCategorySummary.setAutoCreateRowSorter(true);
        tableCategorySummary.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        tableCategorySummary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Food & Drinks ", ""},
                {"Transportations", null},
                {"Utilities", null},
                {"School / Work Projects", null},
                {"Shopping / Personal Needs", null},
                {"Health & Hygiene", null},
                {"Entertainment & Leisure", null},
                {"Savings / Investments", null},
                {"Debs / Loans", null},
                {"Subscriptions", null},
                {"Household Items", null},
                {"Miscellaneous / Others", null}
            },
            new String [] {
                "Category", "Total Amount"
            }
        ));
        tableCategorySummary.setAlignmentX(1.0F);
        tableCategorySummary.setAlignmentY(1.0F);
        tableCategorySummary.setGridColor(new java.awt.Color(106, 212, 177));
        jScrollPane1.setViewportView(tableCategorySummary);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(712, Short.MAX_VALUE)
                .addComponent(returnBtn)
                .addGap(16, 16, 16))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnBtn)
                .addGap(19, 19, 19))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        this.dispose();
        new DashBoard(this.username).setVisible(true);
    }//GEN-LAST:event_returnBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(categorySummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(categorySummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(categorySummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(categorySummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new categorySummary("Guest").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton returnBtn;
    private javax.swing.JTable tableCategorySummary;
    // End of variables declaration//GEN-END:variables
}
