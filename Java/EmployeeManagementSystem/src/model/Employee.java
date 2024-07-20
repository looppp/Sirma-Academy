package model;

import static java.lang.StringTemplate.STR;

public class Employee {
    private String ID;
    private String name;
    private String department;
    private String role;
    private double salary;
    private boolean isActive;

    public Employee (String ID, String name, String department, String role, double salary){
        this.ID = ID;
        this.name = name;
        this.department = department;
        this.role = role;
        this.salary = salary;
        this.isActive = true;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return STR."ID: \{ID}, Name: \{name}, Department: \{department}, Role: \{role}, Salary: \{salary}";
    }
}
