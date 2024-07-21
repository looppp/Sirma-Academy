package data;

import model.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

// Writes the employee data to the CSV file.
// filePath the path to the CSV file where the employee data will be written.
// List of Employee the objects that are going to be written to the file.
// throws IOException if an I/O error occurs while writing to the file.
public class WriterCSV {
    public void writeEmployee(String filePath, List<Employee> employees){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            writer.write("Id,Name,StartDate,EndDate,Department,Role,Salary");
            writer.newLine();

            // Writing each employee's data
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
            // Printing the error message.
            System.out.println(STR."An error has occurred while trying to write to the file: \{e.getMessage()}");
        }
    }
}
