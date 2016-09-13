/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Rahal
 */
public class EmployeeCode {

    public static String getSearchEmployeeQuery() {
//String searchID, String searchFName,String searchLname, String seachEmail
        //SELECT em_employee_f_name,em_employee_lname,em_employee_civil_status,em_employee_email FROM mysql.em_employee WHERE em_employee_id LIKE ? and em_employee_f_name LIKE ? and em_employee_lname LIKE ? and em_employee_email LIKE ?
        System.out.println("Search clicked");
        String query = "SELECT em_employee_f_name,em_employee_lname,em_designation_name,em_employee_civil_status,em_employee_email,em_staff_name  FROM em_employee JOIN em_designation JOIN em_staff WHERE em_employee.em_designation_id= em_designation.em_designation_id AND `em_employee`.`em_staff_id`= `em_staff`.`em_staff_id` AND em_employee_id LIKE ? and em_employee_f_name LIKE ? and em_employee_lname LIKE ? and em_employee_email LIKE ?";
        return query;
    }

}
