package training.dayone.practice31.fabioq;

/**
 * Created by quinzif on 10/08/2016.
 */
public class Director extends Manager {

    private double budget;

    public Director(int empId, String name, String ssn, double salary, String deptName, double budget) {
        super(empId, name, ssn, salary, deptName);
        this.budget = budget;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nBudget: " + getBudget();
    }

    public double getBudget() {
        return budget;
    }
}
