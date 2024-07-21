import data.ReaderCSV;
import data.WriterCSV;
import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

import java.util.List;
import java.util.Scanner;

public class EmployeeManagementApp {
    public static void main(String[] args) {
        ReaderCSV reader = new ReaderCSV();
        WriterCSV writer = new WriterCSV();
        EmployeeServiceImpl service= new EmployeeServiceImpl();
        EmployeeManager manager = new EmployeeManager(service);

        System.out.println("Welcome to Employee Management System");
        displayCommands();

        //Load employees from the file.
        List<Employee> employees = reader.readEmployees("employees.csv");
        employees.forEach(service::addEmployee);

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            String command = scanner.nextLine();
            manager.execute(command);
            if(command.equalsIgnoreCase("save & exit")) isRunning = false;
        }

        //Save the employees to the file.
        writer.writeEmployee("employees.csv", service.listAllEmployees());
        System.out.println("Employees data is saved in employees.csv.");
    }

    private static void displayCommands() {
        System.out.println("Available commands:");
        System.out.println("Add Employee: add <id>, <name>, <startDate>, <endDate>, <department>, <role>, <salary>");
        System.out.println("Edit Employee: edit <id>, <name>, <startDate>, <endDate>, <department>, <role>, <salary>");
        System.out.println("Fire Employee: fire <id>");
        System.out.println("List Employees: list");
        System.out.println("Search Employees by Department: search department <department>");
        System.out.println("Search Employees by ID: search id <id>");
        System.out.println("Search Employees by Name: search name <name>");
        System.out.println("Save and Exit: save & exit");
    }
}
