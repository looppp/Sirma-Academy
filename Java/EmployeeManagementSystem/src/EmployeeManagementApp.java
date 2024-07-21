import data.ReaderCSV;
import data.WriterCSV;
import model.Employee;
import service.EmployeeServiceImpl;

import java.io.File;
import java.util.List;
import java.util.Scanner;

// The main class for running the Employee Management System application.
// This class initializes the system, loads employee data, and handles user commands.
public class EmployeeManagementApp {
    private static final String RESET = "\033[0m"; // Reset to default color
    private static final String Cyan = "\033[38;5;214m";  // Red text


    public static void main(String[] args) {
        // Initialize the components
        ReaderCSV reader = new ReaderCSV();
        WriterCSV writer = new WriterCSV();
        EmployeeServiceImpl service= new EmployeeServiceImpl();
        EmployeeManager manager = new EmployeeManager(service);
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        //Load employees from the file if it exists.
        File file = new File("src/data/employees.csv");
        if(file.exists()){
            List<Employee> employees = reader.readEmployees("src/data/employees.csv");
            employees.forEach(service::addEmployee);
            System.out.println("Loaded employees from employees.csv");
        }

        // Displaying the menu and commands list
        System.out.println(STR."\{Cyan}*** Welcome to Employee Management System ***");
        displayCommands();

        while (isRunning) {
            String command = scanner.nextLine();
            String[] commandToken = command.split("\\s+");
            if(commandToken[0].equalsIgnoreCase("add") || commandToken[0].equalsIgnoreCase("edit")){
                command = STR."\{command}, \{scanner.nextLine()}";
            }
            manager.execute(command);
            if(command.equalsIgnoreCase("save & exit")) isRunning = false;
        }

        //Saves the list of employees to the file.
        writer.writeEmployee("src/data/employees.csv", service.listAllEmployees());
        System.out.println("Employees data is saved in employees.csv");
    }


    private static void displayCommands() {
        System.out.println();
        System.out.println(STR."\{Cyan}These are the available commands:");
        System.out.println(STR."\{Cyan}Add Employee: \{RESET}Add Employee <id>, <name>, <startDate>, <endDate>, <department>, <role>, <salary>");
        System.out.println(STR."\{Cyan}Edit Employee: \{RESET}Edit Employee <id>, <name>, <startDate>, <endDate>, <department>, <role>, <salary>");
        System.out.println(STR."\{Cyan}Fire Employee: \{RESET}Fire <id>");
        System.out.println(STR."\{Cyan}List Employees: \{RESET}List Employees");
        System.out.println(STR."\{Cyan}Search Employees by Department: \{RESET}Search Department <department>");
        System.out.println(STR."\{Cyan}Search Employees by ID: \{RESET}Search Id <id>");
        System.out.println(STR."\{Cyan}Search Employees by Name: \{RESET}Search Name <name>");
        System.out.println(STR."\{Cyan}Save and Exit: \{RESET}Save & Exit");
    }
}
