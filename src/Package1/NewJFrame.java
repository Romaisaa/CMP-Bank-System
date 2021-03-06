package Package1;


import Package1.DriverClass;

public class NewJFrame extends javax.swing.JFrame { // Welcome and Login Frame


    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        userNameTextField = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        InvalidLabel1 = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField(4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 195, 66));
        jPanel1.add(userNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 145, 250, 40));

        userNameLabel.setBackground(new java.awt.Color(153, 0, 76));
        userNameLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(224, 224, 224));
        userNameLabel.setText("User Name");
        jPanel1.add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 145, 132, 45));

        InvalidLabel1.setForeground(new java.awt.Color(255, 0, 0));
        InvalidLabel1.setText("x Invalid Data");
        InvalidLabel1.setVisible(false);
        jPanel1.add(InvalidLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 150, -1));

        welcomeLabel.setBackground(new java.awt.Color(255, 255, 0));
        welcomeLabel.setFont(new java.awt.Font("Yu Gothic", 1, 28)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 204));
        welcomeLabel.setText("Welcome to CMP Bank ");
        jPanel1.add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 340, 90));

        passwordLabel.setBackground(new java.awt.Color(153, 0, 76));
        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(224, 224, 224));
        passwordLabel.setText("PIN");
        jPanel1.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 212, 132, 45));

        jPasswordField1.setText("");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 212, 250, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
       // Login Button takes the data from textfields and tests them by (isFound) method , declared in the driver class
       String PIN =  new String(this.jPasswordField1.getPassword());
        Boolean Check =DriverClass.isFound(userNameTextField.getText(),PIN);
        if (Check){  // Correct data will turn you to the operation frame and close login frame
            InvalidLabel1.setVisible(false);
            new Operation().setVisible(true); 
            dispose();
        }
        else  // Unavialable data shows label to warn you 
        InvalidLabel1.setVisible(true); 
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InvalidLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
