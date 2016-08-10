package training.dayone.practice31.masettir;

/**
 * Created by masettir on 10/08/2016.
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Engineer engineer = new Engineer(101, "Jane Smith", "012-34-2678", 120_345.27);
        Manager manager = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
        Admin admin = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);
        Director director = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

        manager.raiseSalary(2000.00);
        manager.setName("Manageriello Bello Bello");

        engineer.printEmployee();
        manager.printEmployee();
        admin.printEmployee();
        director.printEmployee();
    }
}
