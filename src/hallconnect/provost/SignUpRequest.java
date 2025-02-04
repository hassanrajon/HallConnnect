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
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class SignUpRequest extends javax.swing.JFrame {

    private CentralController controller = new CentralController();

    String username; // provost username
    String hall_name;
    String room;
    int id;
    String stu_name; // student name
    String dept;

    /**
     * Creates new form loginPage
     */
    public SignUpRequest(CentralController controller, String username) {
        this.controller = controller;
        this.username = username;

        initComponents();
        showRechord(username);
    }

    public SignUpRequest(String username) {
        this.username = username;

        initComponents();
        showRechord(username);

    }

    public SignUpRequest() {
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
            String query = "SELECT p.id, p.name, p.reg, "
                    + "pr.room1, pr.room2, pr.room3, pr.dept "
                    + "FROM pending p "
                    + "JOIN pending_room pr ON p.username = pr.username "
                    + "WHERE pr.hall_name = ?";

            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, this.hall_name);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel table_model = (DefaultTableModel) table_info.getModel();
            // clear previous data
            table_model.setRowCount(0);
            // add new data
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String reg = rs.getString("reg");
                String room1 = rs.getString("room1");
                String room2 = rs.getString("room2");
                String room3 = rs.getString("room3");
                String dept = rs.getString("dept");
                Object obj[] = {id, name, reg, dept, room1, room2, room3};
                table_model.addRow(obj);

            }
            rs.close();
            con.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    boolean checkRoom() {

        if (btn_room1.isSelected()) {
            room = btn_room1.getText();
            return true;
        } else if (btn_room2.isSelected()) {
            room = btn_room2.getText();
            return true;
        } else if (btn_room3.isSelected()) {
            room = btn_room3.getText();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "PLEASE ASSIGN A ROOM");
            return false;
        }
    }

    void accept() {

        Connection con = null;
        PreparedStatement insertStudentStmt = null;
        PreparedStatement insertRoomStmt = null;
        PreparedStatement deletePendingStmt = null;
        PreparedStatement deletePendingRoomStmt = null;
        PreparedStatement findUsername = null;

        try {
            // Establish database connection
            con = DbConnection.getConnection();
            con.setAutoCommit(false); // Start transaction

            // Step 1: Insert into student table
            String insertStudentQuery = "INSERT INTO STUDENT (name, reg, session, dob, blood, contact, email, username, pass, question, ans) "
                    + "SELECT name, reg, session, dob, blood, contact, email, username, pass, question, ans "
                    + "FROM pending WHERE id = ?";
            insertStudentStmt = con.prepareStatement(insertStudentQuery);
            insertStudentStmt.setInt(1, id); // Set the id
            int rowsInsertedStudent = insertStudentStmt.executeUpdate();

            // Step 2: Insert into room_details table
            String insertRoomQuery = "INSERT INTO room_details (hall_name, username, room_no, dept) VALUES (?,?,?,?)";
            insertRoomStmt = con.prepareStatement(insertRoomQuery);
            insertRoomStmt.setString(1, hall_name); // Set hall_name
            insertRoomStmt.setString(2, stu_name);  // Set username (stu_name)
            insertRoomStmt.setString(3, room);      // Set room_no
            insertRoomStmt.setString(4, dept);      // Set dept
            int rowsInsertedRoom = insertRoomStmt.executeUpdate();

            // find student username
            String student_username = null;
            findUsername = con.prepareStatement("SELECT username FROM pending where id=?");
            findUsername.setInt(1, id);
            ResultSet rs = findUsername.executeQuery();
            if (rs.next()) {
                student_username = rs.getString("username");
            }
            // Step 3: Delete from pending table
            String deletePendingQuery = "DELETE FROM pending WHERE id = ?";
            deletePendingStmt = con.prepareStatement(deletePendingQuery);
            deletePendingStmt.setInt(1, id); // Set the same id
            int rowsDeletedPending = deletePendingStmt.executeUpdate();

            // Step 4: Delete from pending_room table
            String deletePendingRoomQuery = "DELETE FROM pending_room WHERE username = ?";
            deletePendingRoomStmt = con.prepareStatement(deletePendingRoomQuery);
            deletePendingRoomStmt.setString(1, student_username); // Set username (stu_name)
            int rowsDeletedPendingRoom = deletePendingRoomStmt.executeUpdate();

            // Commit transaction
            con.commit();
            if (rowsInsertedRoom > 0 && rowsDeletedPendingRoom > 0 && rowsDeletedPending > 0 && rowsInsertedStudent > 0) {

                JOptionPane.showMessageDialog(this, "STUDENT ADDED SUCCESSFULLY");
            } else {
                JOptionPane.showMessageDialog(this, "FAILED");

            }
        } catch (Exception e) {
            if (con != null) {
                try {
                    con.rollback(); // Rollback changes if an error occurs

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
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
        table_info = new javax.swing.JTable();
        btn_accept = new javax.swing.JButton();
        btn_reject1 = new javax.swing.JButton();
        btn_room1 = new javax.swing.JRadioButton();
        btn_room2 = new javax.swing.JRadioButton();
        btn_room3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_room = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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

        panel_signupRequest.setBackground(new java.awt.Color(0, 153, 153));
        panel_signupRequest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_signupRequest.addMouseListener(new java.awt.event.MouseAdapter() {
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

        table_info.setBackground(new java.awt.Color(0, 51, 51));
        table_info.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        table_info.setFont(new java.awt.Font("Calisto MT", 0, 16)); // NOI18N
        table_info.setForeground(new java.awt.Color(255, 255, 255));
        table_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "registration no", "department", "Room1", "Room2", "Room3"
            }
        ));
        table_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_infoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_info);

        panel_parent.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 990, 350));

        btn_accept.setBackground(new java.awt.Color(102, 102, 102));
        btn_accept.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_accept.setForeground(new java.awt.Color(255, 255, 255));
        btn_accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hallconnect/icons/add2.png"))); // NOI18N
        btn_accept.setText("ACCEPT");
        btn_accept.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        btn_accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acceptActionPerformed(evt);
            }
        });
        panel_parent.add(btn_accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 690, 180, 60));

        btn_reject1.setBackground(new java.awt.Color(102, 102, 102));
        btn_reject1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_reject1.setForeground(new java.awt.Color(255, 255, 255));
        btn_reject1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hallconnect/icons/delete.png"))); // NOI18N
        btn_reject1.setText("REJECT");
        btn_reject1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        btn_reject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reject1ActionPerformed(evt);
            }
        });
        panel_parent.add(btn_reject1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 690, 180, 60));

        btn_group.add(btn_room1);
        btn_room1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_room1.setForeground(new java.awt.Color(255, 255, 255));
        panel_parent.add(btn_room1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 590, 190, 40));

        btn_group.add(btn_room2);
        btn_room2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_room2.setForeground(new java.awt.Color(255, 255, 255));
        panel_parent.add(btn_room2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 590, 180, 40));

        btn_group.add(btn_room3);
        btn_room3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_room3.setForeground(new java.awt.Color(255, 255, 255));
        panel_parent.add(btn_room3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 590, 170, 40));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("3rd CHOICE");
        panel_parent.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 560, -1, -1));

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

        btn_room.setBackground(new java.awt.Color(102, 102, 102));
        btn_room.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btn_room.setForeground(new java.awt.Color(255, 255, 255));
        btn_room.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hallconnect/icons/icons8-eye.gif"))); // NOI18N
        btn_room.setText("SEE ROOM");
        btn_room.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        btn_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_roomActionPerformed(evt);
            }
        });
        panel_parent.add(btn_room, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 690, 200, 60));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ASSIGN ROOM:");
        panel_parent.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("1st CHOICE");
        panel_parent.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("2nd CHOICE");
        panel_parent.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 560, -1, -1));

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
        panel_parent.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 690, 170, 60));

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

    private void btn_acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acceptActionPerformed
        // TODO add your handling code here:

        if (checkRoom()) {
            accept();
            showRechord(username);
        }
    }//GEN-LAST:event_btn_acceptActionPerformed

    private void btn_reject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reject1ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DbConnection.getConnection();
            // find student username
            String student_username = null;
            PreparedStatement findUsername = con.prepareStatement("SELECT username FROM pending where id=?");
            findUsername.setInt(1, id);
            ResultSet rs = findUsername.executeQuery();
            if (rs.next()) {
                student_username = rs.getString("username");
            }
            // delete from pending
            String deletePendingQuery = "DELETE FROM pending WHERE id = ?";
            PreparedStatement deletePendingStmt = con.prepareStatement(deletePendingQuery);
            deletePendingStmt.setInt(1, id);
            int rowsDeletedPending = deletePendingStmt.executeUpdate();
            // Step 4: Delete from pending_room table
            String deletePendingRoomQuery = "DELETE FROM pending_room WHERE username = ?";
            PreparedStatement deletePendingRoomStmt = con.prepareStatement(deletePendingRoomQuery);
            deletePendingRoomStmt.setString(1, student_username);
            int rowsDeletedPendingRoom = deletePendingRoomStmt.executeUpdate();
            if (rowsDeletedPending > 0 && rowsDeletedPendingRoom > 0) {
                JOptionPane.showMessageDialog(this, "REJECTED SUCCESSFULLY");
                showRechord(username);
            } else {
                JOptionPane.showMessageDialog(this, "REJECTED FAILED");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btn_reject1ActionPerformed

    private void table_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_infoMouseClicked
        // TODO add your handling code here:

        int rowNO = table_info.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel) table_info.getModel();
        btn_room1.setText((String) table.getValueAt(rowNO, 4));
        btn_room2.setText((String) table.getValueAt(rowNO, 5));
        btn_room3.setText((String) table.getValueAt(rowNO, 6));
        id = (int) table_info.getValueAt(rowNO, 0);
        stu_name = (String) table.getValueAt(rowNO, 1);
        dept = (String) table.getValueAt(rowNO, 3);


    }//GEN-LAST:event_table_infoMouseClicked

    private void btn_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_roomActionPerformed
        // TODO add your handling code here:
        controller.addFrame(this);
        RoomSelection roomselection = new RoomSelection(controller, hall_name);
        roomselection.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_roomActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new SignUpRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_accept;
    private javax.swing.JButton btn_back;
    private javax.swing.ButtonGroup btn_group;
    private javax.swing.JButton btn_reject1;
    private javax.swing.JButton btn_room;
    private javax.swing.JRadioButton btn_room1;
    private javax.swing.JRadioButton btn_room2;
    private javax.swing.JRadioButton btn_room3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTable table_info;
    // End of variables declaration//GEN-END:variables
}
