package training.dayone.practice31.grassog;

/**
 * Created by grassog on 10/08/2016.
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Engineer engineer = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Manager manager = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
        Admin admin = new Admin(304, "Bill Monroe", "108-23-6509", 75_002.34);
        Director director = new Director(12, "Susan Wehler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

        EmployeeStockPlan employeeStockPlan = new EmployeeStockPlan();

        printEmployee(engineer, employeeStockPlan);
        printEmployee(manager, employeeStockPlan);
        printEmployee(admin, employeeStockPlan);
        printEmployee(director, employeeStockPlan);

        engineer.raiseSalary(4000);
        printEmployee(engineer, employeeStockPlan);

    }

    public static void printEmployee(Employee emp){
        System.out.println("Employee type: " + emp.getClass().getSimpleName());
        System.out.println(emp);
    }

    public static void printEmployee(Employee emp, EmployeeStockPlan employeeStockPlan){
        printEmployee(emp);
        System.out.println("Stock Options: " + employeeStockPlan.grantStock(emp));
    }



}
