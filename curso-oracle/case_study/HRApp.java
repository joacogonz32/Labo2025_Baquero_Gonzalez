package case_study;
import java.util.ArrayList;

public class HRApp {
    public static void main(String[] args) throws NumberEmployeesExceededException {
        System.out.println("Welcome to HRApp");
        Employee e1 = new Employee(1, "Joaquin", 150.5);
        Employee e2 = new Employee(2, "Julian", 200.0);
        Employee e3 = new Employee(3, "Jose", 125.7);
        ArrayList<Employee> employees = new ArrayList<>();

        try {
            Department d1 = new Department("Binance", employees);
        } catch (NumberEmployeesExceededException e) {
            throw new NumberEmployeesExceededException(e.getMessage());
        }
        Department d2 = new Department("Marketing");
            d2.setEmployees(employees);
            System.out.println(d2.getEmployeeById(1).toString());

        for (Employee e : d2.getEmployees()){
            System.out.println(e.toString());
        }

        System.out.println(d2.totalSalary());
        System.out.println(d2.avgSalary());
    }
}
