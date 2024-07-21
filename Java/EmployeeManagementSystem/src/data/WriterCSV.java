package data;

import model.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

// Writes the employee data to the CSV file.
// filePath the path to the CSV file containing employee data.
// List of Employee contains objects that are read from the file.
// throws IOException if an I/O error occurs while reading the file.
public class WriterCSV {
    public void writeEmployee(String filePath, List<Employee> employees){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            writer.write("Id,Name,StartDate,EndDate,Department,Role,Salary");
            writer.newLine();

            for(Employee employee : employees){
                String formatedEmployee = String.format(Locale.US,"%s,%s,%s,%s,%s,%s,%.2f",
                        employee.getID(),
                        employee.getName(),
                        employee.getStartDate(),
                        employee.getEndDate(),
                        employee.getDepartment(),
                        employee.getRole(),
                        employee.getSalary());
                writer.write(formatedEmployee);
                writer.newLine();
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
