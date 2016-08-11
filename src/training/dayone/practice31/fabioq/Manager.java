package training.dayone.practice31.fabioq;

/**
 * Created by quinzif on 10/08/2016.
 */
public class Manager extends Employee {

    private String deptName;

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDept Name: " + getDeptName();
    }

    public String getDeptName() {
        return deptName;
    }
}
