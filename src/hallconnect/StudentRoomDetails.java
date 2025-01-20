/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hallconnect;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class StudentRoomDetails extends javax.swing.JFrame {
  private CentralController controller = new CentralController();
    /**
     * Creates new form loginPage
     */
    public StudentRoomDetails(CentralController controller) {
        this.controller=controller;
        initComponents();
    }
    public StudentRoomDetails() {
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
        btn_back = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        label_login = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label_home18 = new javax.swing.JLabel();
        label_home19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        label_home21 = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        label_home23 = new javax.swing.JLabel();
        label_home24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        label_home22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addGap(586, 586, 586)
                .addComponent(label_hallconnect)
                .addContainerGap(614, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(label_hallconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        panel_parent.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 130));

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
        panel_parent.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 650, 140, 54));
        panel_parent.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 193, 290, 10));

        label_login.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        label_login.setForeground(new java.awt.Color(255, 255, 255));
        label_login.setText("Room Details");
        panel_parent.add(label_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, -1, 50));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 153, 153), null, null));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_home18.setFont(new java.awt.Font("Arial Black", 1, 22)); // NOI18N
        label_home18.setForeground(new java.awt.Color(255, 255, 255));
        label_home18.setText("Hall Name   :");
        jPanel2.add(label_home18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 30));

        label_home19.setFont(new java.awt.Font("Arial Black", 1, 22)); // NOI18N
        label_home19.setForeground(new java.awt.Color(255, 255, 255));
        label_home19.setText("Room no.     :");
        jPanel2.add(label_home19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 30));

        panel_parent.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 460, 150));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 153, 153), null, null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_home21.setFont(new java.awt.Font("Arial Black", 1, 22)); // NOI18N
        label_home21.setForeground(new java.awt.Color(255, 255, 255));
        label_home21.setText("Choose Room-1    :");
        jPanel3.add(label_home21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 30));

        btn_submit.setBackground(new java.awt.Color(102, 102, 102));
        btn_submit.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_submit.setForeground(new java.awt.Color(255, 255, 255));
        btn_submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hallconnect/icons/signup.png"))); // NOI18N
        btn_submit.setText("SUBMIT");
        btn_submit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        jPanel3.add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 170, 54));

        label_home23.setFont(new java.awt.Font("Arial Black", 1, 22)); // NOI18N
        label_home23.setForeground(new java.awt.Color(255, 255, 255));
        label_home23.setText("Choose Room-2    :");
        jPanel3.add(label_home23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 30));

        label_home24.setFont(new java.awt.Font("Arial Black", 1, 22)); // NOI18N
        label_home24.setForeground(new java.awt.Color(255, 255, 255));
        label_home24.setText("Choose Room-3    :");
        jPanel3.add(label_home24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 30));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        label_home22.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        label_home22.setForeground(new java.awt.Color(255, 255, 255));
        label_home22.setText("Request for room change");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(label_home22)
                .addGap(106, 106, 106))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(label_home22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 650, 70));

        panel_parent.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 730, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_parent, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_parent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        JFrame prev = controller.prevFrame();
        prev.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_submitActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRoomDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRoomDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRoomDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRoomDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRoomDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_submit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_hallconnect;
    private javax.swing.JLabel label_home18;
    private javax.swing.JLabel label_home19;
    private javax.swing.JLabel label_home21;
    private javax.swing.JLabel label_home22;
    private javax.swing.JLabel label_home23;
    private javax.swing.JLabel label_home24;
    private javax.swing.JLabel label_login;
    private javax.swing.JPanel panel_parent;
    // End of variables declaration//GEN-END:variables
}
