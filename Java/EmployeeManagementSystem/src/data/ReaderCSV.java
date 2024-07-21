package data;

import model.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Reads the employee data from the CSV file.
public class ReaderCSV {
    public List<Employee> readEmployees(String filePath){
        List<Employee> employees = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            //Skipping the first line
            reader.readLine();
            String input = reader.readLine();
            while(input != null){
                String[] inputData = input.split(",");
                if(inputData.length == 7){
                    String ID = inputData[0];
                    String name = inputData[1];
                    String startDate = inputData[2];
                    String endDate = inputData[3];
                    String department = inputData[4];
                    String role = inputData[5];
                    double salary = Double.parseDouble(inputData[6]);

                    Employee employee = new Employee(ID, name, startDate, endDate, department, role, salary);
                    employees.add(employee);
                }
                input = reader.readLine();
            }
        } catch (IOException e){
            System.out.println(STR."An error has occurred while trying to read the file: \{e.getMessage()}");
        }
        return employees;
    }
}
