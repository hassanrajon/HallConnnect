/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hallconnect;

/**
 *
 * @author Lenovo
 */
public class temp extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public temp() {
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
        btn_home = new javax.swing.JButton();
        btn_home2 = new javax.swing.JButton();
        btn_home3 = new javax.swing.JButton();
        panel_home1 = new javax.swing.JPanel();
        label_home2 = new javax.swing.JLabel();
        combo_role = new javax.swing.JComboBox<>();
        label_home3 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_parent.setBackground(new java.awt.Color(0, 51, 51));
        panel_parent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_parent.setForeground(new java.awt.Color(255, 255, 255));
        panel_parent.setPreferredSize(new java.awt.Dimension(1536, 800));
        panel_parent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_home.setBackground(new java.awt.Color(153, 153, 153));
        btn_home.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_home.setText("HOME");
        btn_home.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 3, true));
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        panel_parent.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 131, 54));

        btn_home2.setBackground(new java.awt.Color(102, 102, 102));
        btn_home2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_home2.setText("HOME");
        btn_home2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 4, true));
        btn_home2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home2ActionPerformed(evt);
            }
        });
        panel_parent.add(btn_home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 131, 54));

        btn_home3.setBackground(new java.awt.Color(102, 102, 102));
        btn_home3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_home3.setForeground(new java.awt.Color(255, 255, 255));
        btn_home3.setText("HOME");
        btn_home3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        btn_home3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home3ActionPerformed(evt);
            }
        });
        panel_parent.add(btn_home3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 131, 54));

        panel_home1.setBackground(new java.awt.Color(153, 0, 51));
        panel_home1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label_home2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        label_home2.setForeground(new java.awt.Color(255, 255, 255));
        label_home2.setText("HOME");

        javax.swing.GroupLayout panel_home1Layout = new javax.swing.GroupLayout(panel_home1);
        panel_home1.setLayout(panel_home1Layout);
        panel_home1Layout.setHorizontalGroup(
            panel_home1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_home1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(label_home2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        panel_home1Layout.setVerticalGroup(
            panel_home1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_home1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(label_home2)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        panel_parent.add(panel_home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 310, 150));

        combo_role.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        combo_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_parent.add(combo_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 280, 40));

        label_home3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home3.setForeground(new java.awt.Color(255, 255, 255));
        label_home3.setText("HOME :");
        panel_parent.add(label_home3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, -1, 30));

        txt_username.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_username.setText("jTextField1");
        panel_parent.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 482, 280, 40));

        getContentPane().add(panel_parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_home2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_home2ActionPerformed

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
            java.util.logging.Logger.getLogger(temp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(temp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(temp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(temp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new temp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_home2;
    private javax.swing.JButton btn_home3;
    private javax.swing.JComboBox<String> combo_role;
    private javax.swing.JLabel label_home2;
    private javax.swing.JLabel label_home3;
    private javax.swing.JPanel panel_home1;
    private javax.swing.JPanel panel_parent;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}