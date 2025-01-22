/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hallconnect;
import hallconnect.database.CentralController;
import hallconnect.signup.loginPage;
import hallconnect.signup.SignUp;
import javax.swing.JFrame;
/**
 *
 * @author Lenovo
 */
public class MuktijoddhaHall extends javax.swing.JFrame {
CentralController controller = new CentralController();
    /**
     * Creates new form Registration
     */
    public MuktijoddhaHall() {
        initComponents();
    }
    public MuktijoddhaHall(CentralController controller) {
        this.controller=controller;
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

        panel_parent = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        label_hallconnect = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_SignUp = new javax.swing.JButton();
        btn_SignIn = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        label_home3 = new javax.swing.JLabel();
        label_home4 = new javax.swing.JLabel();
        label_home5 = new javax.swing.JLabel();
        label_home7 = new javax.swing.JLabel();
        label_home6 = new javax.swing.JLabel();
        label_home8 = new javax.swing.JLabel();
        label_home19 = new javax.swing.JLabel();
        label_home18 = new javax.swing.JLabel();
        label_home17 = new javax.swing.JLabel();
        label_home16 = new javax.swing.JLabel();
        label_home15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        label_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_parent.setBackground(new java.awt.Color(0, 51, 51));
        panel_parent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_parent.setForeground(new java.awt.Color(255, 255, 255));
        panel_parent.setPreferredSize(new java.awt.Dimension(1536, 800));
        panel_parent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        label_hallconnect.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        label_hallconnect.setForeground(new java.awt.Color(255, 255, 255));
        label_hallconnect.setText("HallConnect");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(564, 564, 564)
                .addComponent(label_hallconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(623, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(label_hallconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        panel_parent.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 130));

        jPanel3.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51, 150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_SignUp.setBackground(new java.awt.Color(102, 102, 102));
        btn_SignUp.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_SignUp.setForeground(new java.awt.Color(255, 255, 255));
        btn_SignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hallconnect/icons/signup.png"))); // NOI18N
        btn_SignUp.setText("SIGNUP");
        btn_SignUp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        btn_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignUpActionPerformed(evt);
            }
        });
        jPanel2.add(btn_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, -1, 53));

        btn_SignIn.setBackground(new java.awt.Color(102, 102, 102));
        btn_SignIn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_SignIn.setForeground(new java.awt.Color(255, 255, 255));
        btn_SignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hallconnect/icons/login.png"))); // NOI18N
        btn_SignIn.setText("SIGNIN");
        btn_SignIn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        btn_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignInActionPerformed(evt);
            }
        });
        jPanel2.add(btn_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 155, 53));

        btn_back.setBackground(new java.awt.Color(102, 102, 102));
        btn_back.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hallconnect/icons/back1.png"))); // NOI18N
        btn_back.setText("BACK");
        btn_back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel2.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, 140, 54));

        label_home3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home3.setForeground(new java.awt.Color(255, 255, 255));
        label_home3.setText("Hall                       :");
        jPanel2.add(label_home3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 37, -1, 30));

        label_home4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home4.setForeground(new java.awt.Color(255, 255, 255));
        label_home4.setText("Provost                  :");
        jPanel2.add(label_home4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        label_home5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home5.setForeground(new java.awt.Color(255, 255, 255));
        label_home5.setText("Current Students  :");
        jPanel2.add(label_home5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));

        label_home7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home7.setForeground(new java.awt.Color(255, 255, 255));
        label_home7.setText("Total Seats           :");
        jPanel2.add(label_home7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 181, -1, 30));

        label_home6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home6.setForeground(new java.awt.Color(255, 255, 255));
        label_home6.setText("Vacant Seats        :");
        jPanel2.add(label_home6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 30));

        label_home8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home8.setForeground(new java.awt.Color(255, 255, 255));
        label_home8.setText("Facilities               :");
        jPanel2.add(label_home8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 30));

        label_home19.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home19.setForeground(new java.awt.Color(255, 255, 255));
        label_home19.setText("placeholder");
        jPanel2.add(label_home19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, 30));

        label_home18.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home18.setForeground(new java.awt.Color(255, 255, 255));
        label_home18.setText("210 ( including 30 seats in a shared room)  ");
        jPanel2.add(label_home18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, 30));

        label_home17.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home17.setForeground(new java.awt.Color(255, 255, 255));
        label_home17.setText("placeholder");
        jPanel2.add(label_home17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, 30));

        label_home16.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home16.setForeground(new java.awt.Color(255, 255, 255));
        label_home16.setText("MD. SHAHID IQBAL");
        jPanel2.add(label_home16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, 30));

        label_home15.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home15.setForeground(new java.awt.Color(255, 255, 255));
        label_home15.setText("Muktijoddha Hall");
        jPanel2.add(label_home15, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 37, -1, 30));

        jList1.setBackground(new java.awt.Color(0,153,153,90));
        jList1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "One large dining room", "One TV room with internet connection", "Indoor game facilities", "Table & Locker for each students", "Appropriate arrangements for the practice of religions" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 800, 210));

        jPanel3.add(jPanel2);
        jPanel2.setBounds(0, 0, 1540, 670);

        label_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hallconnect/icons/final.jpg"))); // NOI18N
        jPanel3.add(label_image);
        label_image.setBounds(0, 0, 1540, 670);

        panel_parent.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1540, 670));

        getContentPane().add(panel_parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignUpActionPerformed
        // TODO add your handling code here:
        controller.addFrame(this);
        SignUp sg = new SignUp(controller);
        sg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_SignUpActionPerformed

    private void btn_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignInActionPerformed
        // TODO add your handling code here:
        controller.addFrame(this);
        loginPage lg = new loginPage(controller);
        lg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_SignInActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        JFrame prev = controller.prevFrame();
        prev.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(MuktijoddhaHall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MuktijoddhaHall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MuktijoddhaHall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MuktijoddhaHall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MuktijoddhaHall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SignIn;
    private javax.swing.JButton btn_SignUp;
    private javax.swing.JButton btn_back;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_hallconnect;
    private javax.swing.JLabel label_home15;
    private javax.swing.JLabel label_home16;
    private javax.swing.JLabel label_home17;
    private javax.swing.JLabel label_home18;
    private javax.swing.JLabel label_home19;
    private javax.swing.JLabel label_home3;
    private javax.swing.JLabel label_home4;
    private javax.swing.JLabel label_home5;
    private javax.swing.JLabel label_home6;
    private javax.swing.JLabel label_home7;
    private javax.swing.JLabel label_home8;
    private javax.swing.JLabel label_image;
    private javax.swing.JPanel panel_parent;
    // End of variables declaration//GEN-END:variables
}
