package training.dayone.practice31.grassog;

/**
 * Created by grassog on 10/08/2016.
 */
public class Manager extends Employee {

    public String getDeptName() {
        return deptName;
    }

    private String deptName;

    public Manager(int empId, String name, String ssn, double salary, String deptName){
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDeptName: " + getDeptName();
    }
}
