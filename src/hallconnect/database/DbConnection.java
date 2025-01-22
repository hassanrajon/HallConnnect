/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hallconnect.database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lenovo
 */
public class DbConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hallconnect", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
