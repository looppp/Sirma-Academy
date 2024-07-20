package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.lang.StringTemplate.STR;

public class Employee {
    private String ID;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private String department;
    private String role;
    private double salary;
    private boolean isActive;

    public Employee (String ID, String name, String department, String role, double salary){
        this.ID = ID;
        this.name = name;
        this.startDate = LocalDate.parse(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        this.department = department;
        this.role = role;
        this.salary = salary;
        this.isActive = true;
    }

    public Employee (String ID, String name, String startDate, String endDate, String department, String role, double salary){
        this.ID = ID;
        this.name = name;
        this.startDate = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.endDate = endDate.equals("null") ? null : LocalDate.parse(startDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.department = department;
        this.role = role;
        this.salary = salary;
        this.isActive = this.endDate == null;
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

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
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
        return STR."ID: \{ID}, Name: \{name}, StartDate: \{startDate}, \{endDate}, Department: \{department}, Role: \{role}, Salary: \{salary}";
    }
}
