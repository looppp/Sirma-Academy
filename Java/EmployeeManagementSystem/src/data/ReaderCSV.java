package data;

import model.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderCSV {
    public List<Employee> readEmployees(String filePath){
        List<Employee> employees = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String input = reader.readLine();
            while(input != null){
                String[] inputData = input.split(",");
                if(inputData.length == 5){
                    String ID = inputData[0];
                    String name = inputData[1];
                    String department = inputData[2];
                    String role = inputData[3];
                    double salary = Double.parseDouble(inputData[4]);

                    Employee employee = new Employee(ID, name, department, role, salary);
                    employees.add(employee);
                }
                input = reader.readLine();
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return employees;
    }
}
