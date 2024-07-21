import model.Employee;
import service.EmployeeService;

import java.util.List;

public class EmployeeManager {
    private EmployeeService service;

    public EmployeeManager(EmployeeService service){
        this.service = service;
    }

    public void execute(String command){
        String[] commandAndInput = command.trim().split(",\\s+");
        String[] commandLine = commandAndInput[0].split("\\s+");
        switch (commandLine[0].toLowerCase()){
            case "add":
                if(service.searchByID(commandAndInput[1]) != null){
                    System.out.println("Employee with this ID already exists.");
                    break;
                }
                else if(commandAndInput.length != 6){
                    System.out.println("Invalid input for Adding an employee.");
                    break;
                } else {
                    Employee employee = new Employee(
                            commandAndInput[1],
                            commandAndInput[2],
                            commandAndInput[3],
                            commandAndInput[4],
                            Double.parseDouble(commandAndInput[5]));
                    service.addEmployee(employee);
                    System.out.println(STR."Employee: \{commandAndInput[2]} is added successfully.");
                }
                break;

            case "edit":
                if(commandAndInput.length != 5){
                    System.out.println("Invalid input for editing an employee.");
                    break;
                }
                else if(service.searchByID(commandLine[1]) == null) {
                    System.out.println("The employee you are attempting to modify doesn't exist.");
                    break;
                }
                else {
                    Employee editedEmployee = new Employee(
                            commandLine[1],
                            commandAndInput[1],
                            commandAndInput[2],
                            commandAndInput[3],
                            Double.parseDouble(commandAndInput[4]));

                    service.editEmployee(commandLine[1], editedEmployee);
                    System.out.println(STR."Employee: \{commandAndInput[1]} is edited successfully.");

                }
                break;

            case "list":
                if(!command.equalsIgnoreCase("list employees")){
                    System.out.println("Incorrect input for listing the employees.");
                } else if(service.listAllEmployees().isEmpty()){
                    System.out.println("The are currently no active employees.");
                } else {
                    service.listAllEmployees().forEach(System.out::println);
                }
                break;
            case "fire":
                if(commandLine.length != 2){
                    System.out.println("Invalid input for firing the employee.");
                    break;
                } else if(service.searchByID(commandLine[1]) == null){
                    System.out.println("The employee you are attempting to fire doesn't exist.");
                    break;
                } else if(!service.searchByID(commandLine[1]).isActive()){
                    System.out.println("The employee is already fired.");
                } else {
                    service.fireEmployee(commandLine[1]);
                    System.out.println("Employee is successfully fired.");
                }
                break;

            case "search":
                if(commandLine.length == 3){
                    if(commandLine[1].equalsIgnoreCase("id")){
                        Employee employee = service.searchByID(commandLine[2]);
                        if(employee != null){
                            System.out.println(employee);
                        } else {
                            System.out.println("Employee not found.");
                        }
                    } else if(commandLine[1].equalsIgnoreCase("department")){
                        List<Employee> employeesInDepartment = service.searchByDepartment(commandLine[2]);
                        if(!employeesInDepartment.isEmpty()){
                            employeesInDepartment.forEach(System.out::println);
                        } else {
                            System.out.println("No employees found in this department.");
                        }
                    } else if(commandLine[1].equalsIgnoreCase("name")){
                        List<Employee> employeesWithName = service.searchByName(commandLine[2]);
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
                if(commandLine[1].equalsIgnoreCase("&") && commandLine[2].equalsIgnoreCase("exit")){
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
