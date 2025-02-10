/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hallconnect.room;

import hallconnect.database.CentralController;
import hallconnect.database.DbConnection;
import hallconnect.provost.provostDashboard;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lenovo
 */
public class FirstFloor extends javax.swing.JFrame {

    private CentralController controller = new CentralController();
    private String hall;


    /**
     * Creates new form loginPage
     */
    public FirstFloor(CentralController controller, String hall) {
        this.controller = controller;
        this.hall = hall;
        initComponents();
        fillinfo();
    }

    public FirstFloor() {
        initComponents();
        fillinfo();

    }

    void fillinfo() {

        try {
            Connection con = DbConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(
                    "SELECT room_no, COUNT(*) FROM room_details WHERE hall_name=? AND room_no IN (101, 102, 103, 107, 108, 109) GROUP BY room_no"
            );
            pst.setString(1, hall);
            ResultSet rs = pst.executeQuery();
            // Store room counts in a map
            Map<String, Integer> roomCounts = new HashMap<>();
            while (rs.next()) {
                roomCounts.put(rs.getString("room_no"), rs.getInt(2)); // Room number -> Occupied count
            }
            // Update labels dynamically (Assuming each room has a max capacity of 6)
            label_vacant_101.setText(String.valueOf(6 - roomCounts.getOrDefault("101", 0)));
            label_vacant_102.setText(String.valueOf(6 - roomCounts.getOrDefault("102", 0)));
            label_vacant_103.setText(String.valueOf(6 - roomCounts.getOrDefault("103", 0)));
            label_vacant_107.setText(String.valueOf(6 - roomCounts.getOrDefault("107", 0)));
            label_vacant_108.setText(String.valueOf(6 - roomCounts.getOrDefault("108", 0)));
            label_vacant_109.setText(String.valueOf(6 - roomCounts.getOrDefault("109", 0)));

            // Close resources
            rs.close();
            pst.close();
            con.close();

        } catch (Exception e) {
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
        btn_back = new javax.swing.JButton();
        label_login = new javax.swing.JLabel();
        panel_109 = new javax.swing.JPanel();
        label_109 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        label_total_109 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        label_vacant_109 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        panel_107 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_vacant_107 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_107 = new javax.swing.JLabel();
        label_total_107 = new javax.swing.JLabel();
        panel_108 = new javax.swing.JPanel();
        label_108 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        label_total_108 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        label_vacant_108 = new javax.swing.JLabel();
        panel_103 = new javax.swing.JPanel();
        label_103 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        label_total_103 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        label_vacant_103 = new javax.swing.JLabel();
        panel_102 = new javax.swing.JPanel();
        label_102 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        label_total_102 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        label_vacant_102 = new javax.swing.JLabel();
        panel_101 = new javax.swing.JPanel();
        label_101 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        label_total_101 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        label_vacant_101 = new javax.swing.JLabel();
        label_login1 = new javax.swing.JLabel();

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
        panel_parent.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 670, 140, 60));

        label_login.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_login.setForeground(new java.awt.Color(255, 255, 255));
        label_login.setText("click to see room details");
        panel_parent.add(label_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 350, 50));

        panel_109.setBackground(new java.awt.Color(0, 51, 51));
        panel_109.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panel_109.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_109MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_109MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_109MouseExited(evt);
            }
        });
        panel_109.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_109.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        label_109.setForeground(new java.awt.Color(255, 255, 255));
        label_109.setText("109");
        panel_109.add(label_109, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 80, 30));

        jLabel32.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("TOTAL:");
        panel_109.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 110, 30));

        label_total_109.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label_total_109.setForeground(new java.awt.Color(255, 255, 255));
        label_total_109.setText("6");
        panel_109.add(label_total_109, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 110, 30));

        jLabel34.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("VACANT:");
        panel_109.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 130, 30));

        label_vacant_109.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label_vacant_109.setForeground(new java.awt.Color(255, 255, 255));
        label_vacant_109.setText("0");
        panel_109.add(label_vacant_109, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 110, 30));

        panel_parent.add(panel_109, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 270, 170));

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
        panel_parent.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 670, 160, 60));

        panel_107.setBackground(new java.awt.Color(0, 51, 51));
        panel_107.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panel_107.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_107MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_107MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_107MouseExited(evt);
            }
        });
        panel_107.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VACANT:");
        panel_107.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 130, 30));

        label_vacant_107.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label_vacant_107.setForeground(new java.awt.Color(255, 255, 255));
        label_vacant_107.setText("0");
        panel_107.add(label_vacant_107, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 110, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TOTAL:");
        panel_107.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 110, 30));

        label_107.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        label_107.setForeground(new java.awt.Color(255, 255, 255));
        label_107.setText("107");
        panel_107.add(label_107, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 80, 30));

        label_total_107.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label_total_107.setForeground(new java.awt.Color(255, 255, 255));
        label_total_107.setText("6");
        panel_107.add(label_total_107, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 110, 30));

        panel_parent.add(panel_107, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 270, 170));

        panel_108.setBackground(new java.awt.Color(0, 51, 51));
        panel_108.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panel_108.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_108MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_108MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_108MouseExited(evt);
            }
        });
        panel_108.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_108.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        label_108.setForeground(new java.awt.Color(255, 255, 255));
        label_108.setText("108");
        panel_108.add(label_108, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 80, 30));

        jLabel27.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("TOTAL:");
        panel_108.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 110, 30));

        label_total_108.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label_total_108.setForeground(new java.awt.Color(255, 255, 255));
        label_total_108.setText("6");
        panel_108.add(label_total_108, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 110, 30));

        jLabel29.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("VACANT:");
        panel_108.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 130, 30));

        label_vacant_108.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label_vacant_108.setForeground(new java.awt.Color(255, 255, 255));
        label_vacant_108.setText("0");
        panel_108.add(label_vacant_108, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 110, 30));

        panel_parent.add(panel_108, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 270, 170));

        panel_103.setBackground(new java.awt.Color(0, 51, 51));
        panel_103.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panel_103.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_103MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_103MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_103MouseExited(evt);
            }
        });
        panel_103.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_103.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        label_103.setForeground(new java.awt.Color(255, 255, 255));
        label_103.setText("103");
        panel_103.add(label_103, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 80, 30));

        jLabel47.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("TOTAL:");
        panel_103.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 110, 30));

        label_total_103.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label_total_103.setForeground(new java.awt.Color(255, 255, 255));
        label_total_103.setText("6");
        panel_103.add(label_total_103, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 110, 30));

        jLabel49.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("VACANT:");
        panel_103.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 130, 30));

        label_vacant_103.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label_vacant_103.setForeground(new java.awt.Color(255, 255, 255));
        label_vacant_103.setText("0");
        panel_103.add(label_vacant_103, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 110, 30));

        panel_parent.add(panel_103, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 180, 280, 170));

        panel_102.setBackground(new java.awt.Color(0, 51, 51));
        panel_102.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panel_102.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_102MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_102MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_102MouseExited(evt);
            }
        });
        panel_102.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_102.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        label_102.setForeground(new java.awt.Color(255, 255, 255));
        label_102.setText("102");
        panel_102.add(label_102, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 80, 30));

        jLabel42.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("TOTAL:");
        panel_102.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 110, 30));

        label_total_102.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label_total_102.setForeground(new java.awt.Color(255, 255, 255));
        label_total_102.setText("6");
        panel_102.add(label_total_102, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 110, 30));

        jLabel44.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("VACANT:");
        panel_102.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 130, 30));

        label_vacant_102.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label_vacant_102.setForeground(new java.awt.Color(255, 255, 255));
        label_vacant_102.setText("0");
        panel_102.add(label_vacant_102, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 110, 30));

        panel_parent.add(panel_102, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 370, 280, 170));

        panel_101.setBackground(new java.awt.Color(0, 51, 51));
        panel_101.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panel_101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_101MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_101MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_101MouseExited(evt);
            }
        });
        panel_101.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_101.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        label_101.setForeground(new java.awt.Color(255, 255, 255));
        label_101.setText("101");
        panel_101.add(label_101, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 80, 30));

        jLabel37.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("TOTAL:");
        panel_101.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 110, 30));

        label_total_101.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label_total_101.setForeground(new java.awt.Color(255, 255, 255));
        label_total_101.setText("6");
        panel_101.add(label_total_101, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 110, 30));

        jLabel39.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("VACANT:");
        panel_101.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 130, 30));

        label_vacant_101.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label_vacant_101.setForeground(new java.awt.Color(255, 255, 255));
        label_vacant_101.setText("0");
        panel_101.add(label_vacant_101, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 110, 30));

        panel_parent.add(panel_101, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 560, 280, 170));

        label_login1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        label_login1.setForeground(new java.awt.Color(255, 255, 255));
        label_login1.setText("FIRST FLOOR");
        panel_parent.add(label_login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 290, 50));

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

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void panel_109MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_109MouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0, 153, 153);
        panel_109.setBackground(clr);
    }//GEN-LAST:event_panel_109MouseEntered

    private void panel_109MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_109MouseExited
        // TODO add your handling code here:
        Color clr = new Color(0, 51, 51);
        panel_109.setBackground(clr);
    }//GEN-LAST:event_panel_109MouseExited

    private void panel_107MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_107MouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0, 153, 153);
        panel_107.setBackground(clr);
    }//GEN-LAST:event_panel_107MouseEntered

    private void panel_107MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_107MouseExited
        // TODO add your handling code here:
        Color clr = new Color(0, 51, 51);
        panel_107.setBackground(clr);
    }//GEN-LAST:event_panel_107MouseExited

    private void panel_107MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_107MouseClicked
        // TODO add your handling code here:
        controller.addFrame(this);
        new RoomDetails(controller,hall,6,"107").setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_panel_107MouseClicked

    private void panel_108MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_108MouseClicked
        // TODO add your handling code here:
        controller.addFrame(this);
        new RoomDetails(controller,hall,6,"108").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_panel_108MouseClicked

    private void panel_108MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_108MouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0, 153, 153);
        panel_108.setBackground(clr);
    }//GEN-LAST:event_panel_108MouseEntered

    private void panel_108MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_108MouseExited
        // TODO add your handling code here:
        Color clr = new Color(0, 51, 51);
        panel_108.setBackground(clr);
    }//GEN-LAST:event_panel_108MouseExited

    private void panel_103MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_103MouseClicked
        // TODO add your handling code here:
        controller.addFrame(this);
        new RoomDetails(controller,hall,6,"103").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_panel_103MouseClicked

    private void panel_103MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_103MouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0, 153, 153);
        panel_103.setBackground(clr);
    }//GEN-LAST:event_panel_103MouseEntered

    private void panel_103MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_103MouseExited
        // TODO add your handling code here:
        Color clr = new Color(0, 51, 51);
        panel_103.setBackground(clr);
    }//GEN-LAST:event_panel_103MouseExited

    private void panel_102MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_102MouseClicked
        // TODO add your handling code here:
        controller.addFrame(this);
        new RoomDetails(controller,hall,6,"102").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_panel_102MouseClicked

    private void panel_102MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_102MouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0, 153, 153);
        panel_102.setBackground(clr);
    }//GEN-LAST:event_panel_102MouseEntered

    private void panel_102MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_102MouseExited
        // TODO add your handling code here:
        Color clr = new Color(0, 51, 51);
        panel_102.setBackground(clr);
    }//GEN-LAST:event_panel_102MouseExited

    private void panel_101MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_101MouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0, 153, 153);
        panel_101.setBackground(clr);
    }//GEN-LAST:event_panel_101MouseEntered

    private void panel_101MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_101MouseExited
        // TODO add your handling code here:
        Color clr = new Color(0, 51, 51);
        panel_101.setBackground(clr);
    }//GEN-LAST:event_panel_101MouseExited

    private void panel_109MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_109MouseClicked
        // TODO add your handling code here:
        controller.addFrame(this);
        new RoomDetails(controller,hall,6,"109").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_panel_109MouseClicked

    private void panel_101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_101MouseClicked
        // TODO add your handling code here:
        controller.addFrame(this);
        new RoomDetails(controller,hall,6,"101").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_panel_101MouseClicked

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
            java.util.logging.Logger.getLogger(FirstFloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstFloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstFloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstFloor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FirstFloor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_101;
    private javax.swing.JLabel label_102;
    private javax.swing.JLabel label_103;
    private javax.swing.JLabel label_107;
    private javax.swing.JLabel label_108;
    private javax.swing.JLabel label_109;
    private javax.swing.JLabel label_hallconnect;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_login1;
    private javax.swing.JLabel label_total_101;
    private javax.swing.JLabel label_total_102;
    private javax.swing.JLabel label_total_103;
    private javax.swing.JLabel label_total_107;
    private javax.swing.JLabel label_total_108;
    private javax.swing.JLabel label_total_109;
    private javax.swing.JLabel label_vacant_101;
    private javax.swing.JLabel label_vacant_102;
    private javax.swing.JLabel label_vacant_103;
    private javax.swing.JLabel label_vacant_107;
    private javax.swing.JLabel label_vacant_108;
    private javax.swing.JLabel label_vacant_109;
    private javax.swing.JPanel panel_101;
    private javax.swing.JPanel panel_102;
    private javax.swing.JPanel panel_103;
    private javax.swing.JPanel panel_107;
    private javax.swing.JPanel panel_108;
    private javax.swing.JPanel panel_109;
    private javax.swing.JPanel panel_parent;
    // End of variables declaration//GEN-END:variables
}
