package Util;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.management.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Rahal
 */
public class DatabaseConnection {

    static Connection conn = null;

    public static Connection connect() {
        String url = "jdbc:mysql://localhost:3306/test2";
        String username = "root";
        String password = "123";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Error: " + e.getMessage());
        }

        return conn;
    }

    public static void checkConnection() {
        if (DatabaseConnection.conn != null) {

            JOptionPane.showMessageDialog(null, "Connection Stablished");
        } else {
            JOptionPane.showMessageDialog(null, "Connection Faliure,Please contact the Admin");
        }
    }

    public static ResultSet getResultSet(String query) {
        ResultSet rs = null;

        try {

            Statement stat = (Statement) DatabaseConnection.connect().createStatement();
            rs = stat.executeQuery(query);

//            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(query);
//            rs = pst.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    public static void closeConnection() {
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
