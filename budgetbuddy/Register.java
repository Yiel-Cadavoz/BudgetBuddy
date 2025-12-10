package budgetbuddy;

import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.JFrame;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LogoPanel2 = new javax.swing.JLabel();
        RegisterBtn1 = new javax.swing.JButton();
        UsernameTextField = new javax.swing.JTextField();
        PasswordTextField = new javax.swing.JPasswordField();
        ConfirmPasswordTextField = new javax.swing.JPasswordField();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        ConfirmPasswordLabel = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();

        RegisterBtn.setBackground(new java.awt.Color(106, 212, 177));
        RegisterBtn.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        RegisterBtn.setForeground(new java.awt.Color(31, 60, 136));
        RegisterBtn.setText("REGISTER");
        RegisterBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        LogoPanel2.setBackground(new java.awt.Color(217, 217, 217));
        LogoPanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-dashboard.png"))); // NOI18N

        RegisterBtn1.setBackground(new java.awt.Color(106, 212, 177));
        RegisterBtn1.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        RegisterBtn1.setForeground(new java.awt.Color(31, 60, 136));
        RegisterBtn1.setText("REGISTER");
        RegisterBtn1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        RegisterBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtn1ActionPerformed(evt);
            }
        });

        UsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });

        PasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextFieldActionPerformed(evt);
            }
        });

        ConfirmPasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPasswordTextFieldActionPerformed(evt);
            }
        });

        UsernameLabel.setText("USERNAME: ");

        PasswordLabel.setText("PASSWORD:");

        ConfirmPasswordLabel.setText("CONFIRM PASSWORD:");

        jLabelMin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(31, 60, 136));
        jLabelMin.setText("-");
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(31, 60, 136));
        jLabelClose.setText("X");
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RegisterBtn1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UsernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                                    .addComponent(PasswordTextField)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ConfirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ConfirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LogoPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelClose)
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelMin)
                        .addComponent(jLabelClose)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(RegisterBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
//not included
    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void RegisterBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtn1ActionPerformed
        String username = UsernameTextField.getText().trim();
        String password = new String(PasswordTextField.getPassword());
        String confirmPassword = new String(ConfirmPasswordTextField.getPassword());

        // EMPTY FIELDS CHECK
        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            return;
        }

        // PASSWORD MATCH CHECK
        if (!password.equals(confirmPassword)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Passwords do not match!");
            return;
        }

        // CHECK IF USER EXISTS
        java.io.File file = new java.io.File("users.txt");
        try {
            file.createNewFile(); // creates if not existing
            try (java.util.Scanner scanner = new java.util.Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(",");
                    if (parts.length >= 1 && parts[0].equalsIgnoreCase(username)) {
                        javax.swing.JOptionPane.showMessageDialog(this, "Username already exists!");
                        scanner.close();
                        return;
                    }
                }
            }
        } catch (HeadlessException | IOException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error reading file!");
            return;
        }

        // SAVE NEW USER
        try (java.io.FileWriter fw = new java.io.FileWriter("users.txt", true)) {
            fw.write(username + "," + password + "\n");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error saving user!");
            return;
        }

        javax.swing.JOptionPane.showMessageDialog(this, "Registration successful!");

        // OPEN LOGIN PAGE
        LogIn loginPage = new LogIn();
        loginPage.setVisible(true);
        loginPage.pack();
        loginPage.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_RegisterBtn1ActionPerformed

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextFieldActionPerformed
        PasswordTextField.requestFocus();
    }//GEN-LAST:event_UsernameTextFieldActionPerformed

    private void ConfirmPasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasswordTextFieldActionPerformed
        RegisterBtn1.doClick();
    }//GEN-LAST:event_ConfirmPasswordTextFieldActionPerformed

    private void PasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextFieldActionPerformed
        ConfirmPasswordTextField.requestFocus();
    }//GEN-LAST:event_PasswordTextFieldActionPerformed

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConfirmPasswordLabel;
    private javax.swing.JPasswordField ConfirmPasswordTextField;
    private javax.swing.JLabel LogoPanel2;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordTextField;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JButton RegisterBtn1;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
