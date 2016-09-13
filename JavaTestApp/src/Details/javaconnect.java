package Details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rahal
 */
public class javaconnect {

    static Connection conn = null;

    public static Connection connect() {
        String url = "jdbc:mysql://localhost:3306/test2";
        String username = "root";
        String password = "123";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);

            if (conn != null) {
                JOptionPane.showMessageDialog(null, "Connection Stablished");
            }

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Error: " + e.getMessage());
            return null;
        }

        return conn;
    }

}
