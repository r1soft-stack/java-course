package training.daytwo.practice52.fulippo;

public class Main {
    public static void main(String[] args) {
        Employee gianna = new Employee(1, "Gianna", "123456", 123456);

        System.out.println("Gianna bonus: " + gianna.getBonus());
        System.out.println("Gianna withHolding: " + gianna.getWithHolding());
    }
}
