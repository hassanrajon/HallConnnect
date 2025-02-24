/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hallconnect.provost;


import hallconnect.room.RoomSelection;
import hallconnect.database.CentralController;
import hallconnect.database.DbConnection;
import hallconnect.signup.loginPage;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class ProvostComplainBox extends javax.swing.JFrame {

    private CentralController controller = new CentralController();

    String username; // provost username
    String hall_name;
    String title;
    String stu_name; // student name
    String text;

    /**
     * Creates new form loginPage
     */
    public ProvostComplainBox(CentralController controller, String username) {
        this.controller = controller;
        this.username = username;

        initComponents();
        showRechord(username);
    }

    public ProvostComplainBox(String username) {
        this.username = username;
        initComponents();
        showRechord(username);

    }

    public ProvostComplainBox() {
        initComponents();
    }

//    BANGABONDHU HALL
//MUKTIJODDHA HALL
//BANGAMATA HALL
    void showRechord(String username) {

        hall_name = switch (username) {
            case "abu_naser" ->
                "BANGABONDHU HALL";
            case "naznin_ara" ->
                "BANGAMATA HALL";
            default ->
                "MUKTIJODDHA HALL";
        };
        try {
            Connection con = DbConnection.getConnection();
            String query = "SELECT username,title,text FROM complain where hall_name=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, this.hall_name);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel table_model = (DefaultTableModel) table_complain.getModel();
            // clear previous data
            table_model.setRowCount(0);
            // add new data
            while (rs.next()) {

                String name = rs.getString("username");
                String title = rs.getString("title");
                String text = rs.getString("text");
                Object obj[] = {name, title, text};
                table_model.addRow(obj);

            }
            rs.close();
            con.close();
            pst.close();
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

        btn_group = new javax.swing.ButtonGroup();
        panel_parent = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        label_hallconnect = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panel_complainBox = new javax.swing.JPanel();
        label_home3 = new javax.swing.JLabel();
        label_home14 = new javax.swing.JLabel();
        panel_hallFee = new javax.swing.JPanel();
        label_home12 = new javax.swing.JLabel();
        label_home13 = new javax.swing.JLabel();
        panel_clearance = new javax.swing.JPanel();
        label_home7 = new javax.swing.JLabel();
        label_home11 = new javax.swing.JLabel();
        panel_hallAsso = new javax.swing.JPanel();
        label_home6 = new javax.swing.JLabel();
        label_home10 = new javax.swing.JLabel();
        panel_addNotice = new javax.swing.JPanel();
        label_home5 = new javax.swing.JLabel();
        label_home9 = new javax.swing.JLabel();
        panel_signupRequest = new javax.swing.JPanel();
        label_home2 = new javax.swing.JLabel();
        label_home8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_complain = new javax.swing.JTable();
        btn_reject1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_see = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

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
                .addGap(587, 587, 587)
                .addComponent(label_hallconnect)
                .addContainerGap(597, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(label_hallconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panel_parent.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 80));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_complainBox.setBackground(new java.awt.Color(0, 153, 153));
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

        label_home3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home3.setForeground(new java.awt.Color(255, 255, 255));
        label_home3.setText("COMPLAIN");
        panel_complainBox.add(label_home3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 160, -1));

        label_home14.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home14.setForeground(new java.awt.Color(255, 255, 255));
        label_home14.setText("BOX");
        panel_complainBox.add(label_home14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jPanel2.add(panel_complainBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 340, 80));

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

        label_home12.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home12.setForeground(new java.awt.Color(255, 255, 255));
        label_home12.setText("HALL FEE ");
        panel_hallFee.add(label_home12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        label_home13.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home13.setForeground(new java.awt.Color(255, 255, 255));
        label_home13.setText("REQUEST");
        panel_hallFee.add(label_home13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jPanel2.add(panel_hallFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 340, 80));

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

        label_home7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home7.setForeground(new java.awt.Color(255, 255, 255));
        label_home7.setText("CLEARANCE");
        panel_clearance.add(label_home7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, -1));

        label_home11.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home11.setForeground(new java.awt.Color(255, 255, 255));
        label_home11.setText("REQUEST");
        panel_clearance.add(label_home11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jPanel2.add(panel_clearance, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 340, 80));

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

        label_home6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home6.setForeground(new java.awt.Color(255, 255, 255));
        label_home6.setText("ASSOCIATES");
        panel_hallAsso.add(label_home6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 200, -1));

        label_home10.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home10.setForeground(new java.awt.Color(255, 255, 255));
        label_home10.setText("HALL");
        panel_hallAsso.add(label_home10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, -1));

        jPanel2.add(panel_hallAsso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 340, 80));

        panel_addNotice.setBackground(new java.awt.Color(153, 0, 51));
        panel_addNotice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_addNotice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_addNoticeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_addNoticeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_addNoticeMouseExited(evt);
            }
        });
        panel_addNotice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_home5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home5.setForeground(new java.awt.Color(255, 255, 255));
        label_home5.setText("NOTICE");
        panel_addNotice.add(label_home5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        label_home9.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home9.setForeground(new java.awt.Color(255, 255, 255));
        label_home9.setText("ADD");
        panel_addNotice.add(label_home9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(panel_addNotice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 340, 80));

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

        label_home2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home2.setForeground(new java.awt.Color(255, 255, 255));
        label_home2.setText("SIGNUP");
        panel_signupRequest.add(label_home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        label_home8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_home8.setForeground(new java.awt.Color(255, 255, 255));
        label_home8.setText("REQUEST");
        panel_signupRequest.add(label_home8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jPanel2.add(panel_signupRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 340, 80));

        panel_parent.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 380, 600));

        table_complain.setBackground(new java.awt.Color(0, 51, 51));
        table_complain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        table_complain.setFont(new java.awt.Font("Calisto MT", 0, 16)); // NOI18N
        table_complain.setForeground(new java.awt.Color(255, 255, 255));
        table_complain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "title", "text"
            }
        ));
        table_complain.setRowHeight(40);
        table_complain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_complainMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_complain);

        panel_parent.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 990, 450));

        btn_reject1.setBackground(new java.awt.Color(102, 102, 102));
        btn_reject1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_reject1.setForeground(new java.awt.Color(255, 255, 255));
        btn_reject1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hallconnect/icons/delete.png"))); // NOI18N
        btn_reject1.setText("DELETE");
        btn_reject1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        btn_reject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reject1ActionPerformed(evt);
            }
        });
        panel_parent.add(btn_reject1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, 180, 60));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setBackground(new java.awt.Color(153, 102, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CLICK ANY ROW TO SELECT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        panel_parent.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 500, 50));

        btn_see.setBackground(new java.awt.Color(102, 102, 102));
        btn_see.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_see.setForeground(new java.awt.Color(255, 255, 255));
        btn_see.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hallconnect/icons/icons8-eye.gif"))); // NOI18N
        btn_see.setText("SEE ");
        btn_see.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        btn_see.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seeActionPerformed(evt);
            }
        });
        panel_parent.add(btn_see, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 650, 200, 60));

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
        panel_parent.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 650, 170, 60));

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

    private void btn_seeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seeActionPerformed
           // Create a JTextArea to hold the long text
    JTextArea textArea = new JTextArea(text, 10, 40); // 10 rows, 40 columns
    textArea.setFont(new Font("Arial", Font.BOLD, 16)); // Adjust font size
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    textArea.setEditable(false);

    // Put the JTextArea inside a JScrollPane to make it scrollable
    JScrollPane scrollPane = new JScrollPane(textArea);
    
    // Show the scrollable text in a JOptionPane
    JOptionPane.showMessageDialog(panel_parent, scrollPane, "Message", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btn_seeActionPerformed

    private void btn_reject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reject1ActionPerformed
        // TODO add your handling code here:
        if (stu_name.equals("")) {
            JOptionPane.showMessageDialog(this, "Please select any row to delete");
        } else {
            try {
                Connection con = DbConnection.getConnection();
                PreparedStatement pst = con.prepareStatement("DELETE FROM complain WHERE hall_name = ? AND username = ? AND title = ? AND text = ?");
                pst.setString(1, hall_name);
                pst.setString(2, stu_name);
                pst.setString(3, title);
                pst.setString(4, text);
                int rowsAffected = pst.executeUpdate(); // Use executeUpdate() for DELETE operations

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Complain deleted successfully");
                    showRechord(username);
                } else {
                    JOptionPane.showMessageDialog(this, "No matching record found");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_btn_reject1ActionPerformed

    private void table_complainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_complainMouseClicked
        // TODO add your handling code here:
        int rowcount = table_complain.getSelectedRow();
        stu_name = table_complain.getValueAt(rowcount, 0).toString();
        title = table_complain.getValueAt(rowcount, 1).toString();
        text = table_complain.getValueAt(rowcount, 2).toString();
    }//GEN-LAST:event_table_complainMouseClicked

    private void panel_signupRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_signupRequestMouseExited
        // TODO add your handling code here:
        Color clr = new Color(153, 0, 51);
        panel_signupRequest.setBackground(clr);
    }//GEN-LAST:event_panel_signupRequestMouseExited

    private void panel_signupRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_signupRequestMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0, 153, 153);
        panel_signupRequest.setBackground(clr);
    }//GEN-LAST:event_panel_signupRequestMouseEntered

    private void panel_signupRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_signupRequestMouseClicked
        // TODO add your handling code here:
        controller.addFrame(this);
        new SignUpRequest(controller, username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_panel_signupRequestMouseClicked

    private void panel_addNoticeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_addNoticeMouseExited
        // TODO add your handling code here:
        Color clr = new Color(153, 0, 51);
        panel_addNotice.setBackground(clr);
    }//GEN-LAST:event_panel_addNoticeMouseExited

    private void panel_addNoticeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_addNoticeMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0, 153, 153);
        panel_addNotice.setBackground(clr);
    }//GEN-LAST:event_panel_addNoticeMouseEntered

    private void panel_addNoticeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_addNoticeMouseClicked
        // TODO add your handling code here:
        controller.addFrame(this);
        new ProvostNotice(controller).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_panel_addNoticeMouseClicked

    private void panel_hallAssoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_hallAssoMouseExited
        // TODO add your handling code here:
        Color clr = new Color(153, 0, 51);
        panel_hallAsso.setBackground(clr);
    }//GEN-LAST:event_panel_hallAssoMouseExited

    private void panel_hallAssoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_hallAssoMouseEntered
        // TODO add your handling code here:

        Color clr = new Color(0, 153, 153);
        panel_hallAsso.setBackground(clr);
    }//GEN-LAST:event_panel_hallAssoMouseEntered

    private void panel_clearanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_clearanceMouseExited
        // TODO add your handling code here:
        Color clr = new Color(153, 0, 51);
        panel_clearance.setBackground(clr);
    }//GEN-LAST:event_panel_clearanceMouseExited

    private void panel_clearanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_clearanceMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0, 153, 153);
        panel_clearance.setBackground(clr);
    }//GEN-LAST:event_panel_clearanceMouseEntered

    private void panel_hallFeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_hallFeeMouseExited
        // TODO add your handling code here:
        Color clr = new Color(153, 0, 51);
        panel_hallFee.setBackground(clr);
    }//GEN-LAST:event_panel_hallFeeMouseExited

    private void panel_hallFeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_hallFeeMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0, 153, 153);
        panel_hallFee.setBackground(clr);
    }//GEN-LAST:event_panel_hallFeeMouseEntered

    private void panel_complainBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_complainBoxMouseExited
        // TODO add your handling code here:
        //        Color clr = new Color(153, 0, 51);
        //        panel_complainBox.setBackground(clr);
    }//GEN-LAST:event_panel_complainBoxMouseExited

    private void panel_complainBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_complainBoxMouseEntered
        // TODO add your handling code here:
        //        Color clr = new Color(0, 153, 153);
        //        panel_complainBox.setBackground(clr);
    }//GEN-LAST:event_panel_complainBoxMouseEntered

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
            java.util.logging.Logger.getLogger(ProvostComplainBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProvostComplainBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProvostComplainBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProvostComplainBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ProvostComplainBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.ButtonGroup btn_group;
    private javax.swing.JButton btn_reject1;
    private javax.swing.JButton btn_see;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JPanel panel_addNotice;
    private javax.swing.JPanel panel_clearance;
    private javax.swing.JPanel panel_complainBox;
    private javax.swing.JPanel panel_hallAsso;
    private javax.swing.JPanel panel_hallFee;
    private javax.swing.JPanel panel_parent;
    private javax.swing.JPanel panel_signupRequest;
    private javax.swing.JTable table_complain;
    // End of variables declaration//GEN-END:variables
}
