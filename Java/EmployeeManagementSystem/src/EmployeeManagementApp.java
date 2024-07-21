import data.ReaderCSV;
import data.WriterCSV;
import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagementApp {
    public static void main(String[] args) {
        ReaderCSV reader = new ReaderCSV();
        WriterCSV writer = new WriterCSV();
        EmployeeServiceImpl service= new EmployeeServiceImpl();
        EmployeeManager manager = new EmployeeManager(service);

        System.out.println("*** Welcome to Employee Management System ***");
        displayCommands();

        //Load employees from the file.
        File file = new File("src/data/employees.csv");
        if(file.exists()){
            List<Employee> employees = reader.readEmployees("src/data/employees.csv");
            employees.forEach(service::addEmployee);
            System.out.println("Loaded employees from employees.csv");
        }


        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            String command = scanner.nextLine();
            String[] commandToken = command.split("\\s+");
            if(commandToken[0].equalsIgnoreCase("add") || commandToken[0].equalsIgnoreCase("edit")){
                command = STR."\{command}, \{scanner.nextLine()}";
            }
            manager.execute(command);
            if(command.equalsIgnoreCase("save & exit")) isRunning = false;
        }

        //Save the employees to the file.
        writer.writeEmployee("src/data/employees.csv", service.listAllEmployees());
        System.out.println("Employees data is saved in employees.csv");
    }

    private static void displayCommands() {
        System.out.println();
        System.out.println("These are the available commands:");
        System.out.println();
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
