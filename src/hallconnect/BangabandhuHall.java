/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hallconnect;

/**
 *
 * @author Lenovo
 */
public class BangabandhuHall extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public BangabandhuHall() {
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
        btn_home3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label_home3 = new javax.swing.JLabel();
        label_home4 = new javax.swing.JLabel();
        label_home5 = new javax.swing.JLabel();
        label_home6 = new javax.swing.JLabel();
        label_home7 = new javax.swing.JLabel();
        label_home8 = new javax.swing.JLabel();
        label_home14 = new javax.swing.JLabel();
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

        btn_home3.setBackground(new java.awt.Color(102, 102, 102));
        btn_home3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_home3.setForeground(new java.awt.Color(255, 255, 255));
        btn_home3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hallconnect/icons/back_arrow.png"))); // NOI18N
        btn_home3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        btn_home3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_home3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(479, 479, 479)
                .addComponent(label_hallconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(623, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(label_hallconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btn_home3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        panel_parent.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 130));

        jPanel3.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51, 150));

        label_home3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home3.setForeground(new java.awt.Color(255, 255, 255));
        label_home3.setText("Hall                       :");

        label_home4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home4.setForeground(new java.awt.Color(255, 255, 255));
        label_home4.setText("Provost                 :");

        label_home5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home5.setForeground(new java.awt.Color(255, 255, 255));
        label_home5.setText("Current Students :");

        label_home6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home6.setForeground(new java.awt.Color(255, 255, 255));
        label_home6.setText("Vacant Seats       :");

        label_home7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home7.setForeground(new java.awt.Color(255, 255, 255));
        label_home7.setText("Total Seats           :");

        label_home8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home8.setForeground(new java.awt.Color(255, 255, 255));
        label_home8.setText("Events                   :");

        label_home14.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home14.setForeground(new java.awt.Color(255, 255, 255));
        label_home14.setText("Bangabandhu Hall");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_home8)
                    .addComponent(label_home5)
                    .addComponent(label_home4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label_home3)
                        .addGap(18, 18, 18)
                        .addComponent(label_home14))
                    .addComponent(label_home6)
                    .addComponent(label_home7))
                .addContainerGap(986, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_home3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_home14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label_home4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_home5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_home7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_home6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_home8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
        );

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

    private void btn_home3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_home3ActionPerformed

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
            java.util.logging.Logger.getLogger(BangabandhuHall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BangabandhuHall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BangabandhuHall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BangabandhuHall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new BangabandhuHall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_home3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel label_hallconnect;
    private javax.swing.JLabel label_home14;
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
