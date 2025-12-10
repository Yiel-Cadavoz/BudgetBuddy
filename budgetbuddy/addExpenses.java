package budgetbuddy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class addExpenses extends javax.swing.JFrame {

    private final String username;

    public addExpenses(String username) {
        initComponents();
        this.username = username;
        groupCategoryButtons();
    }

    private void groupCategoryButtons() {
        javax.swing.ButtonGroup group = new javax.swing.ButtonGroup();
        group.add(foodsAndDrinks);
        group.add(transport);
        group.add(utilities);
        group.add(groceries);
        group.add(entertainment);
        group.add(health);
        group.add(education);
        group.add(shopping);
        group.add(bills);
        group.add(travel);
        group.add(gifts);
        group.add(others);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        categoryLabel = new javax.swing.JLabel();
        categoryLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        foodsAndDrinks = new javax.swing.JRadioButton();
        transport = new javax.swing.JRadioButton();
        utilities = new javax.swing.JRadioButton();
        groceries = new javax.swing.JRadioButton();
        entertainment = new javax.swing.JRadioButton();
        health = new javax.swing.JRadioButton();
        education = new javax.swing.JRadioButton();
        shopping = new javax.swing.JRadioButton();
        bills = new javax.swing.JRadioButton();
        travel = new javax.swing.JRadioButton();
        gifts = new javax.swing.JRadioButton();
        others = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        pesoSign = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addExpenseButton = new javax.swing.JButton();
        monthDropdown = new javax.swing.JComboBox<>();
        monthLabel = new javax.swing.JLabel();
        dayLabel = new javax.swing.JLabel();
        dayTextField = new javax.swing.JTextField();
        yearLabel = new javax.swing.JLabel();
        yearTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(106, 212, 177));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 151));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brand.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 28, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        categoryLabel.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        categoryLabel.setForeground(new java.awt.Color(31, 60, 136));
        categoryLabel.setText("CATEGORY:");
        jPanel2.add(categoryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 18, 183, 30));

        categoryLabel1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        categoryLabel1.setForeground(new java.awt.Color(31, 60, 136));
        categoryLabel1.setText("NOTES:");
        jPanel2.add(categoryLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 228, 175, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 350, 80));

        foodsAndDrinks.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        foodsAndDrinks.setForeground(new java.awt.Color(31, 60, 136));
        foodsAndDrinks.setText("Food & Drinks");
        jPanel2.add(foodsAndDrinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, 183, -1));

        transport.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        transport.setForeground(new java.awt.Color(31, 60, 136));
        transport.setText("Transport");
        transport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportActionPerformed(evt);
            }
        });
        jPanel2.add(transport, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 83, 183, -1));

        utilities.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        utilities.setForeground(new java.awt.Color(31, 60, 136));
        utilities.setText("Utilities");
        jPanel2.add(utilities, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 183, -1));

        groceries.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        groceries.setForeground(new java.awt.Color(31, 60, 136));
        groceries.setText("Groceries");
        jPanel2.add(groceries, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 141, 183, -1));

        entertainment.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        entertainment.setForeground(new java.awt.Color(31, 60, 136));
        entertainment.setText("Entertainment");
        jPanel2.add(entertainment, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 170, -1, -1));

        health.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        health.setForeground(new java.awt.Color(31, 60, 136));
        health.setText("Health");
        jPanel2.add(health, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 199, 183, -1));

        education.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        education.setForeground(new java.awt.Color(31, 60, 136));
        education.setText("Education");
        jPanel2.add(education, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 54, 175, -1));

        shopping.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        shopping.setForeground(new java.awt.Color(31, 60, 136));
        shopping.setText("Shopping");
        jPanel2.add(shopping, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 83, 175, -1));

        bills.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        bills.setForeground(new java.awt.Color(31, 60, 136));
        bills.setText("Bills ");
        jPanel2.add(bills, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 112, 175, -1));

        travel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        travel.setForeground(new java.awt.Color(31, 60, 136));
        travel.setText("Travel");
        jPanel2.add(travel, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 141, 175, -1));

        gifts.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        gifts.setForeground(new java.awt.Color(31, 60, 136));
        gifts.setText("Gifts");
        jPanel2.add(gifts, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 170, 175, -1));

        others.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        others.setForeground(new java.awt.Color(31, 60, 136));
        others.setText("Others");
        jPanel2.add(others, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 199, 175, -1));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(31, 60, 136));
        jLabel3.setText("AMOUNT:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 140, 20));

        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        jPanel2.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 110, 30));

        pesoSign.setText("  P");
        jPanel2.add(pesoSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 20, 30));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(31, 60, 136));
        jLabel4.setText("DATE:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 120, 30));

        addExpenseButton.setBackground(new java.awt.Color(106, 212, 177));
        addExpenseButton.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addExpenseButton.setForeground(new java.awt.Color(31, 60, 136));
        addExpenseButton.setText("ADD");
        addExpenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExpenseButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addExpenseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 100, 40));

        monthDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        monthDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthDropdownActionPerformed(evt);
            }
        });
        jPanel2.add(monthDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        monthLabel.setText("MONTH: ");
        jPanel2.add(monthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 136, -1, 30));

        dayLabel.setText("DAY: ");
        jPanel2.add(dayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, 20));

        dayTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dayTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 30, -1));

        yearLabel.setText("YEAR:");
        jPanel2.add(yearLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, 20));
        jPanel2.add(yearTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 180, 80, -1));

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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void monthDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthDropdownActionPerformed

    private void dayTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayTextFieldActionPerformed

    private void addExpenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExpenseButtonActionPerformed
        addExpense();
        this.dispose();
        DashBoard dash = new DashBoard(username); // pass username back
        dash.setVisible(true);
    }//GEN-LAST:event_addExpenseButtonActionPerformed

    private void transportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transportActionPerformed

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
            java.util.logging.Logger.getLogger(addExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new addExpenses("Guest").setVisible(true);
        });
    }

    private void addExpense() {
        // 1. GET CATEGORY
        String category = null;

        if (foodsAndDrinks.isSelected()) {
            category = "Food & Drinks";
        } else if (transport.isSelected()) {
            category = "Transport";
        } else if (utilities.isSelected()) {
            category = "Utilities";
        } else if (groceries.isSelected()) {
            category = "Groceries";
        } else if (entertainment.isSelected()) {
            category = "Entertainment";
        } else if (health.isSelected()) {
            category = "Health";
        } else if (education.isSelected()) {
            category = "Education";
        } else if (shopping.isSelected()) {
            category = "Shopping";
        } else if (bills.isSelected()) {
            category = "Bills";
        } else if (travel.isSelected()) {
            category = "Travel";
        } else if (gifts.isSelected()) {
            category = "Gifts";
        } else if (others.isSelected()) {
            category = "Others";
        }

        if (category == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a category.");
            return;
        }

        // 2. NOTES (optional)
        String notes = jTextArea1.getText().trim();

        // 3. AMOUNT
        double amt;
        try {
            amt = Double.parseDouble(amount.getText());
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Invalid amount.");
            return;
        }

        // 4. DATE
        String month = monthDropdown.getSelectedItem().toString();
        String day = dayTextField.getText();
        String year = yearTextField.getText();

        if (day.isEmpty() || year.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter day and year.");
            return;
        }
// parse date string to LocalDate
        LocalDate expenseDate;
        try {
            String dateStr = month + " " + day + ", " + year; // e.g., "December 10, 2025"
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
            expenseDate = LocalDate.parse(dateStr, formatter);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Invalid date.");
            return;
        }

        // 5. CREATE EXPENSE OBJECT
        Expense expense = new Expense(category, notes, amt, expenseDate);

        // 6. ADD TO EXPENSE MANAGER
        ExpenseManager manager = ExpenseManager.getInstance();
        manager.addExpense(expense);

        // 7. SUCCESS MESSAGE
        javax.swing.JOptionPane.showMessageDialog(this, "Expense Added!");

        // 8. CLEAR FIELDS
        amount.setText("");
        jTextArea1.setText("");
        dayTextField.setText("");
        yearTextField.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addExpenseButton;
    private javax.swing.JTextField amount;
    private javax.swing.JRadioButton bills;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JLabel categoryLabel1;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JTextField dayTextField;
    private javax.swing.JRadioButton education;
    private javax.swing.JRadioButton entertainment;
    private javax.swing.JRadioButton foodsAndDrinks;
    private javax.swing.JRadioButton gifts;
    private javax.swing.JRadioButton groceries;
    private javax.swing.JRadioButton health;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> monthDropdown;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JRadioButton others;
    private javax.swing.JLabel pesoSign;
    private javax.swing.JRadioButton shopping;
    private javax.swing.JRadioButton transport;
    private javax.swing.JRadioButton travel;
    private javax.swing.JRadioButton utilities;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
