import service.EmployeeService;

public class EmployeeManager {
    private EmployeeService service;

    public EmployeeManager(EmployeeService service){
        this.service = service;
    }

    public void execute(String command){
        String[] currentCommand = command.trim().split(",\\s*|\\s+");
        switch (currentCommand[0].toLowerCase()){

        }
    }
}
