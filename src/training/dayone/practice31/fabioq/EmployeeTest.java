package training.dayone.practice31.fabioq;

/**
 * Created by quinzif on 10/08/2016.
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Engineer e1 = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Manager m1 = new Manager(207, "Barbarella Bella", "111-11-3434", 109_501.33,"US Marketing");
        Admin a1 = new Admin(304, "Pino Admino", "999-23-4453", 75_002.34);
        Director d1 = new Director(12, "O Direttoriell", "111-11-1111", 130_222.34, "Global Marketing", 1_000_000.00);

        a1.raiseSalary(2_000);

        e1.printEmployee();
        m1.printEmployee();
        a1.printEmployee();
        d1.printEmployee();

        a1.raiseSalary(-100);
        d1.setName("");
    }
}
