
package jdbcexamplea;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class main {
public static void main(String[] args) {
// Add employees
employeeDAO.addEmployee("Alice Cooper", "Developer", 70000);
employeeDAO.addEmployee("Bob Marley", "Manager", 80000);

// Update employee

employeeDAO.updateEmployee( 1,"John Doe", "Senior Software Engineer", 90000);
// Get all employees
List<Employee> employees = employeeDAO.getAllEmployees();
employees.forEach(System.out::println);
// Delete employee
employeeDAO.deleteEmployee(2);
}
}    

