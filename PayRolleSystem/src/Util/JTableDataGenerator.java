/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rahal
 */
public class JTableDataGenerator {

    public static void FillTable(JTable table,ResultSet rs) {
        try {
            
//            try (Statement stat = (Statement) DatabaseConnection.connect().createStatement();
//                    ResultSet rs = stat.executeQuery(Query)) {

                //To remove previously added rows
                while (table.getRowCount() > 0) {
                    ((DefaultTableModel) table.getModel()).removeRow(0);
                }
                int columns = rs.getMetaData().getColumnCount();
                while (rs.next()) {
//                    System.out.println("rs:"+rs.getRow());
                    Object[] row = new Object[columns];
                    for (int i = 1; i <= columns; i++) {
                        row[i - 1] = rs.getObject(i);
                    }
                    ((DefaultTableModel) table.getModel()).insertRow(rs.getRow() - 1, row);
                }

//            }
            DatabaseConnection.closeConnection();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
