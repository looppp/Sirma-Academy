import model.Employee;
import service.EmployeeService;

import java.sql.SQLOutput;
import java.util.List;

public class EmployeeManager {
    private EmployeeService service;

    public EmployeeManager(EmployeeService service){
        this.service = service;
    }

    public void execute(String command){
        String[] commandToken = command.trim().split(",\\s*|\\s+");
        switch (commandToken[0].toLowerCase()){
            case "add":
                if(commandToken.length == 7){
                    Employee employee = new Employee(
                            commandToken[2],
                            commandToken[3],
                            commandToken[4],
                            commandToken[5],
                            Double.parseDouble(commandToken[6]));
                    service.addEmployee(employee);
                    System.out.println(STR."Employee: \{commandToken[3]} is added successfully.");
                } else {
                    System.out.println("Invalid input for Adding an employee.");
                }
                break;
            case "edit":
                if(commandToken.length == 6){
                    Employee editedEmployee = new Employee(
                            commandToken[1],
                            commandToken[2],
                            commandToken[3],
                            commandToken[4],
                            Double.parseDouble(commandToken[5]));

                    service.editEmployee(commandToken[1], editedEmployee);
                    System.out.println(STR."Employee: \{commandToken[2]} is edited successfully.");
                } else {
                    System.out.println("Invalid input for editing an employee.");
                }
                break;
            case "list":
                service.listAllEmployees().forEach(System.out::println);
                break;
            case "fire":
                if(commandToken.length == 2){
                    service.fireEmployee(commandToken[1]);
                    System.out.println("Employee is successfully fired.");
                } else {
                    System.out.println("Invalid input for firing the employee.");
                }
                break;
            case "search":
                if(commandToken.length == 3){
                    if(commandToken[1].equalsIgnoreCase("id")){
                        Employee employee = service.searchByID(commandToken[2]);
                        if(employee != null){
                            System.out.println(employee);
                        } else {
                            System.out.println("Employee not found.");
                        }
                    } else if(commandToken[1].equalsIgnoreCase("Department")){
                        List<Employee> employeesInDepartment = service.searchByDepartment(commandToken[2]);
                        if(employeesInDepartment != null){
                            employeesInDepartment.forEach(System.out::println);
                        } else {
                            System.out.println("No employees found in this department.");
                        }
                    } else if(commandToken[1].equalsIgnoreCase("name")){
                        List<Employee> employeesWithName = service.searchByName(commandToken[2]);
                        if(employeesWithName != null){
                            employeesWithName.forEach(System.out::println);
                        } else {
                            System.out.println("No employees found with the given name.");
                        }
                    }
                } else {
                    System.out.println("Invalid input for searching employees.");
                }
                break;
            case "save":
                if(commandToken[1].equalsIgnoreCase("&") && commandToken[2].equalsIgnoreCase("exit")){
                    System.out.println("Saving the data and exiting the application.");
                    break;
                } else {
                    System.out.println("Invalid input for saving and exiting the app.");
                }
                break;
            default:
                System.out.println("Invalid input.");

        }
    }
}
