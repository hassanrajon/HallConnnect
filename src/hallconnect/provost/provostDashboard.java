/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hallconnect.provost;

import hallconnect.database.CentralController;
import hallconnect.database.DbConnection;
import hallconnect.signup.loginPage;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class provostDashboard extends javax.swing.JFrame {

    private CentralController controller = new CentralController();
    String username = "";

    /**
     * Creates new form loginPage
     */
    public provostDashboard(CentralController controller, String username) {
        this.controller = controller;
        this.username = username;
        fillInfo();
        initComponents();
    }

    public provostDashboard(String username) {
        this.username = username;
        
        initComponents();
        fillInfo();
    }

    public provostDashboard() {
        initComponents();
    }

   void fillInfo() {
    try {
        Connection con = DbConnection.getConnection();
        PreparedStatement pst = con.prepareStatement("SELECT * FROM provost WHERE username=?");
        pst.setString(1, username);
        ResultSet rs = pst.executeQuery();

        // Check if the ResultSet contains data
        if (rs.next()) {
            label_name.setText(rs.getString("name"));
            label_blood.setText(rs.getString("blood"));
            label_contact.setText(rs.getString("contact"));
            label_email.setText(rs.getString("email"));
            label_post.setText(rs.getString("profile"));
        } else {
            // Handle the case when no rows are found
            System.out.println("No data found for username: " + username);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
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
        btn_logout = new javax.swing.JButton();
        panel_profile = new javax.swing.JPanel();
        label_blood = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        label_name = new javax.swing.JLabel();
        label_post = new javax.swing.JLabel();
        label_contact = new javax.swing.JLabel();
        label_email = new javax.swing.JLabel();
        label_blood1 = new javax.swing.JLabel();
        label_blood2 = new javax.swing.JLabel();
        label_blood3 = new javax.swing.JLabel();
        panel_signupRequest = new javax.swing.JPanel();
        label_home2 = new javax.swing.JLabel();
        label_home8 = new javax.swing.JLabel();
        panel_complainBox = new javax.swing.JPanel();
        label_home3 = new javax.swing.JLabel();
        label_home14 = new javax.swing.JLabel();
        panel_hallFee = new javax.swing.JPanel();
        label_home12 = new javax.swing.JLabel();
        label_home13 = new javax.swing.JLabel();
        panel_addNotice = new javax.swing.JPanel();
        label_home5 = new javax.swing.JLabel();
        label_home9 = new javax.swing.JLabel();
        panel_hallAsso = new javax.swing.JPanel();
        label_home6 = new javax.swing.JLabel();
        label_home10 = new javax.swing.JLabel();
        panel_clearance = new javax.swing.JPanel();
        label_home7 = new javax.swing.JLabel();
        label_home11 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_parent.setBackground(new java.awt.Color(0, 51, 51));
        panel_parent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_parent.setForeground(new java.awt.Color(255, 255, 255));
        panel_parent.setPreferredSize(new java.awt.Dimension(1536, 800));
        panel_parent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        label_hallconnect.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        label_hallconnect.setForeground(new java.awt.Color(255, 255, 255));
        label_hallconnect.setText(" HallConnect");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(588, 588, 588)
                .addComponent(label_hallconnect)
                .addContainerGap(596, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(label_hallconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        panel_parent.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 130));

        btn_logout.setBackground(new java.awt.Color(102, 102, 102));
        btn_logout.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hallconnect/icons/logout.png"))); // NOI18N
        btn_logout.setText("LOGOUT");
        btn_logout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        panel_parent.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 200, 70));

        panel_profile.setBackground(new java.awt.Color(0, 102, 102));
        panel_profile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panel_profile.setForeground(new java.awt.Color(255, 255, 255));
        panel_profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_blood.setBackground(new java.awt.Color(51, 255, 0));
        label_blood.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        label_blood.setForeground(new java.awt.Color(255, 255, 255));
        label_blood.setText("AB-");
        panel_profile.add(label_blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 90, 40));

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panel_profile.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 70, 990, 10));

        label_name.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        label_name.setForeground(new java.awt.Color(255, 255, 255));
        label_name.setText("ABU NASER MOJUMDER");
        panel_profile.add(label_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 350, 40));

        label_post.setBackground(new java.awt.Color(51, 255, 0));
        label_post.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        label_post.setForeground(new java.awt.Color(255, 255, 255));
        label_post.setText("department head of cse");
        panel_profile.add(label_post, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 350, 40));

        label_contact.setBackground(new java.awt.Color(51, 255, 0));
        label_contact.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        label_contact.setForeground(new java.awt.Color(255, 255, 255));
        label_contact.setText("01788888888");
        panel_profile.add(label_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 170, 40));

        label_email.setBackground(new java.awt.Color(51, 255, 0));
        label_email.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        label_email.setForeground(new java.awt.Color(255, 255, 255));
        label_email.setText("cse@gmail.com");
        panel_profile.add(label_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 280, 40));

        label_blood1.setBackground(new java.awt.Color(51, 255, 0));
        label_blood1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        label_blood1.setForeground(new java.awt.Color(255, 255, 255));
        label_blood1.setText("CONTACT:");
        panel_profile.add(label_blood1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, 40));

        label_blood2.setBackground(new java.awt.Color(51, 255, 0));
        label_blood2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        label_blood2.setForeground(new java.awt.Color(255, 255, 255));
        label_blood2.setText("BLOOD GROUP:");
        panel_profile.add(label_blood2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 230, 40));

        label_blood3.setBackground(new java.awt.Color(51, 255, 0));
        label_blood3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        label_blood3.setForeground(new java.awt.Color(255, 255, 255));
        label_blood3.setText("E-MAIL:");
        panel_profile.add(label_blood3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 120, 40));

        panel_parent.add(panel_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 170, 420, 420));

        panel_signupRequest.setBackground(new java.awt.Color(153, 0, 51));
        panel_signupRequest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_signupRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_signupRequestMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_signupRequestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_signupRequestMouseExited(evt);
            }
        });
        panel_signupRequest.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_home2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        label_home2.setForeground(new java.awt.Color(255, 255, 255));
        label_home2.setText("SIGNUP");
        panel_signupRequest.add(label_home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        label_home8.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        label_home8.setForeground(new java.awt.Color(255, 255, 255));
        label_home8.setText("REQUEST");
        panel_signupRequest.add(label_home8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        panel_parent.add(panel_signupRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 310, 150));

        panel_complainBox.setBackground(new java.awt.Color(153, 0, 51));
        panel_complainBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_complainBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_complainBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_complainBoxMouseExited(evt);
            }
        });
        panel_complainBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_home3.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        label_home3.setForeground(new java.awt.Color(255, 255, 255));
        label_home3.setText("COMPLAIN");
        panel_complainBox.add(label_home3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 230, -1));

        label_home14.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        label_home14.setForeground(new java.awt.Color(255, 255, 255));
        label_home14.setText("BOX");
        panel_complainBox.add(label_home14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        panel_parent.add(panel_complainBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 310, 150));

        panel_hallFee.setBackground(new java.awt.Color(153, 0, 51));
        panel_hallFee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_hallFee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_hallFeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_hallFeeMouseExited(evt);
            }
        });
        panel_hallFee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_home12.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        label_home12.setForeground(new java.awt.Color(255, 255, 255));
        label_home12.setText("HALL FEE ");
        panel_hallFee.add(label_home12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        label_home13.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        label_home13.setForeground(new java.awt.Color(255, 255, 255));
        label_home13.setText("REQUEST");
        panel_hallFee.add(label_home13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        panel_parent.add(panel_hallFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 310, 150));

        panel_addNotice.setBackground(new java.awt.Color(153, 0, 51));
        panel_addNotice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_addNotice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_addNoticeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_addNoticeMouseExited(evt);
            }
        });
        panel_addNotice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_home5.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        label_home5.setForeground(new java.awt.Color(255, 255, 255));
        label_home5.setText("NOTICE");
        panel_addNotice.add(label_home5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        label_home9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        label_home9.setForeground(new java.awt.Color(255, 255, 255));
        label_home9.setText("ADD");
        panel_addNotice.add(label_home9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        panel_parent.add(panel_addNotice, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 310, 150));

        panel_hallAsso.setBackground(new java.awt.Color(153, 0, 51));
        panel_hallAsso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_hallAsso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_hallAssoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_hallAssoMouseExited(evt);
            }
        });
        panel_hallAsso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_home6.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        label_home6.setForeground(new java.awt.Color(255, 255, 255));
        label_home6.setText("ASSOCIATES");
        panel_hallAsso.add(label_home6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 280, -1));

        label_home10.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        label_home10.setForeground(new java.awt.Color(255, 255, 255));
        label_home10.setText("HALL");
        panel_hallAsso.add(label_home10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, -1));

        panel_parent.add(panel_hallAsso, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 310, 150));

        panel_clearance.setBackground(new java.awt.Color(153, 0, 51));
        panel_clearance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_clearance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_clearanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_clearanceMouseExited(evt);
            }
        });
        panel_clearance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_home7.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        label_home7.setForeground(new java.awt.Color(255, 255, 255));
        label_home7.setText("CLEARANCE");
        panel_clearance.add(label_home7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, -1));

        label_home11.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        label_home11.setForeground(new java.awt.Color(255, 255, 255));
        label_home11.setText("REQUEST");
        panel_clearance.add(label_home11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        panel_parent.add(panel_clearance, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 310, 150));

        btn_exit.setBackground(new java.awt.Color(102, 102, 102));
        btn_exit.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hallconnect/icons/exit.png"))); // NOI18N
        btn_exit.setText(" EXIT");
        btn_exit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        panel_parent.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 630, 200, 70));

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

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:

        loginPage lg = new loginPage();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void panel_signupRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_signupRequestMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0, 153, 153);
        panel_signupRequest.setBackground(clr);
    }//GEN-LAST:event_panel_signupRequestMouseEntered

    private void panel_hallFeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_hallFeeMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0, 153, 153);
        panel_hallFee.setBackground(clr);

    }//GEN-LAST:event_panel_hallFeeMouseEntered

    private void panel_complainBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_complainBoxMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0, 153, 153);
        panel_complainBox.setBackground(clr);
    }//GEN-LAST:event_panel_complainBoxMouseEntered

    private void panel_addNoticeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_addNoticeMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0, 153, 153);
        panel_addNotice.setBackground(clr);
    }//GEN-LAST:event_panel_addNoticeMouseEntered

    private void panel_hallAssoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_hallAssoMouseEntered
        // TODO add your handling code here:

        Color clr = new Color(0, 153, 153);
        panel_hallAsso.setBackground(clr);
    }//GEN-LAST:event_panel_hallAssoMouseEntered

    private void panel_clearanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_clearanceMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0, 153, 153);
        panel_clearance.setBackground(clr);
    }//GEN-LAST:event_panel_clearanceMouseEntered

    private void panel_signupRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_signupRequestMouseExited
        // TODO add your handling code here:
        Color clr = new Color(153, 0, 51);
        panel_signupRequest.setBackground(clr);
    }//GEN-LAST:event_panel_signupRequestMouseExited

    private void panel_addNoticeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_addNoticeMouseExited
        // TODO add your handling code here:
        Color clr = new Color(153, 0, 51);
        panel_addNotice.setBackground(clr);
    }//GEN-LAST:event_panel_addNoticeMouseExited

    private void panel_hallFeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_hallFeeMouseExited
        // TODO add your handling code here:
        Color clr = new Color(153, 0, 51);
        panel_hallFee.setBackground(clr);
    }//GEN-LAST:event_panel_hallFeeMouseExited

    private void panel_hallAssoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_hallAssoMouseExited
        // TODO add your handling code here:
        Color clr = new Color(153, 0, 51);
        panel_hallAsso.setBackground(clr);
    }//GEN-LAST:event_panel_hallAssoMouseExited

    private void panel_complainBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_complainBoxMouseExited
        // TODO add your handling code here:
        Color clr = new Color(153, 0, 51);
        panel_complainBox.setBackground(clr);
    }//GEN-LAST:event_panel_complainBoxMouseExited

    private void panel_clearanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_clearanceMouseExited
        // TODO add your handling code here:
        Color clr = new Color(153, 0, 51);
        panel_clearance.setBackground(clr);
    }//GEN-LAST:event_panel_clearanceMouseExited

    private void panel_signupRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_signupRequestMouseClicked
        // TODO add your handling code here:
        controller.addFrame(this);
        new SignUpRequest(controller, username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_panel_signupRequestMouseClicked

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
            java.util.logging.Logger.getLogger(provostDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(provostDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(provostDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(provostDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new provostDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_logout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_blood;
    private javax.swing.JLabel label_blood1;
    private javax.swing.JLabel label_blood2;
    private javax.swing.JLabel label_blood3;
    private javax.swing.JLabel label_contact;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_hallconnect;
    private javax.swing.JLabel label_home10;
    private javax.swing.JLabel label_home11;
    private javax.swing.JLabel label_home12;
    private javax.swing.JLabel label_home13;
    private javax.swing.JLabel label_home14;
    private javax.swing.JLabel label_home2;
    private javax.swing.JLabel label_home3;
    private javax.swing.JLabel label_home5;
    private javax.swing.JLabel label_home6;
    private javax.swing.JLabel label_home7;
    private javax.swing.JLabel label_home8;
    private javax.swing.JLabel label_home9;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_post;
    private javax.swing.JPanel panel_addNotice;
    private javax.swing.JPanel panel_clearance;
    private javax.swing.JPanel panel_complainBox;
    private javax.swing.JPanel panel_hallAsso;
    private javax.swing.JPanel panel_hallFee;
    private javax.swing.JPanel panel_parent;
    private javax.swing.JPanel panel_profile;
    private javax.swing.JPanel panel_signupRequest;
    // End of variables declaration//GEN-END:variables
}
