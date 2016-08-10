package training.dayone.practice31.fulippo;


public class Manager extends Employee{

    private String dept;

    public Manager(int empId, String name, String ssn, double salary, String dept) {
        super(empId, name, ssn, salary);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }
}
