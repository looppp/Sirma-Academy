package service;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    private List<Employee> employees;

    public EmployeeServiceImpl(){
        this.employees = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee employee) {
            employees.add(employee);
    }

    @Override
    public void editEmployee(String ID, Employee editedEmployee) {
            for(Employee employee : employees){
                if(employee.getID().equals(ID)){
                    employee.setName(editedEmployee.getName());
                    employee.setDepartment(editedEmployee.getDepartment());
                    employee.setRole(editedEmployee.getRole());
                    employee.setSalary(editedEmployee.getSalary());
                    return;
                }
            }
    }

    @Override
    public void fireEmployee(String ID) {
            for(Employee employee : employees){
                if(employee.getID().equals(ID)){
                    employee.setActive(false);
                    return;
                }
            }
    }

    @Override
    public List<Employee> listAllEmployees() {
        return employees.stream()
                .filter(Employee::isActive)
                .toList();
    }

    @Override
    public Employee searchByID(String ID) {
        for(Employee employee : employees){
            if(employee.getID().equals(ID)){
                return employee;
            }
        }

        return null;
    }

    @Override
    public List<Employee> searchByName(String name) {
        return employees.stream()
                .filter(employee -> employee.getName().equals(name) && employee.isActive())
                .toList();
    }

    @Override
    public List<Employee> searchByDepartment(String department) {
        return employees.stream()
                .filter(employee -> employee.getDepartment().equals(department) && employee.isActive())
                .toList();
    }
}