package training.dayone.practice31.fulippo;

public class EmployeeTest {
    public static void main(String[] args) {


        Engineer cane = new Engineer(100_000_000, "Ing. Cane", "123345456", 123_00_00_00);
        Admin admin = new Admin(100, "Ad Min", "234123", 100);
        Manager man = new Manager(200, "Hey Man", "34582345234", 34234, "Tempio 1");
        Director dir = new Director(200, "Direttò", "34582345234", 123190000_0, "Tempio 1", 123123_3);


        printEmployee(cane);
        printEmployee(admin);
        printEmployee(man);
        printEmployee(dir);


        dir.raiseSalary(123_333);
        EmployeeStockPlan plan = new EmployeeStockPlan();
        printEmployee(dir, plan);
    }

    public static void printEmployee(Employee e){
        System.out.println(String.format("Type: %s%n", e.getClass().getSimpleName()) + e.toString());
    }

    public static void printEmployee(Employee e, EmployeeStockPlan plan){
        System.out.println( String.format("Type: %s%n", e.getClass().getSimpleName()) + e.toString() + String.format("Stock Options: %s%n", plan.grantStock(e)));
    }
}
