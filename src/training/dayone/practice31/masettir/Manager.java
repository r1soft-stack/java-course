package training.dayone.practice31.masettir;

/**
 * Created by masettir on 10/08/2016.
 */
public class Manager extends Employee{

    private String deptName;

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
    }

    public String getDeptName() {
        return deptName;
    }
}
