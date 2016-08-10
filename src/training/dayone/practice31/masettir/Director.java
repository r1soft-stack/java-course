package training.dayone.practice31.masettir;

/**
 * Created by masettir on 10/08/2016.
 */
public class Director extends Manager {

    /**
     *
     */
    private double budget;

    /**
     *
     * @param empId
     * @param name
     * @param ssn
     * @param salary
     * @param deptName
     * @param budget
     */
    public Director(int empId, String name, String ssn, double salary, String deptName, double budget) {
        super(empId, name, ssn, salary, deptName);
    }

    /**
     *
     * @return
     */
    public double getBudget() {
        return budget;
    }
}
