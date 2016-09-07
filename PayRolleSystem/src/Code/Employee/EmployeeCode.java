/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code.Employee;

import java.util.Date;

/**
 *
 * @author Rahal
 */
public class EmployeeCode {

    public static String SearchEmployee(String searchID, String searchFName, String seachEmail,Date date) {

        System.out.println("Search clicked");
        String concat = null;
        String query = "SELECT em_employee_f_name,em_employee_lname,em_employee_civil_status,em_employee_date_of_joining FROM mysql.em_employee WHERE";

        concat = query.concat(" em_employee_f_name LIKE '%" + searchFName + "%' and em_employee_id LIKE '%" + searchID + "%' and em_employee_email LIKE '%" + seachEmail + "%' and em_employee_date_of_joining ='"+date+"'");
        System.out.println("query is: " + concat);

        return concat;
    }

}
