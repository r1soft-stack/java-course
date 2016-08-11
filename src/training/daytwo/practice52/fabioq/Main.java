package training.daytwo.practice52.fabioq;

/**
 * Created by quinzif on 11/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee jane = new Employee(11, "Jane Doe", "Manager", 65_000);
        Employee john = new Employee(11, "John Doe", "Staff", 75_000);


        System.out.println("Jane's withholding: " + jane.getWithholding());
        System.out.println("John's bonus: " + john.getBonus());

        Customer jack = new Customer("Jack", Branch.MUMBAI);
        System.out.println(jack.getBranch());
        System.out.println(jack.getClass());
    }
}
