package service;

import model.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);
    void editEmployee(String ID, Employee editedEmployee);
    void fireEmployee(String ID);
    List<Employee> listAllEmployees();
    Employee searchByID(String ID);
    List<Employee> searchByName(String name);
    List<Employee> searchByDepartment(String department);
}
