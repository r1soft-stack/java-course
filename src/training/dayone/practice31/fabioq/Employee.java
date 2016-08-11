package training.dayone.practice31.fabioq;
import java.text.NumberFormat;

/**
 * Created by quinzif on 10/08/2016.
 */
public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public void setName(String name){
        if (name.equals("")){
            System.out.println("\nName cannot be empty.\n");
        }
        this.name = name;
    }

    public void raiseSalary (double increase){
        if(increase < 0){
            System.out.println("\nCannot increse by a negative amount.\n");
        }else {
            this.salary += increase;
        }
    }

    public Employee (int empId, String name, String ssn, double salary){
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp ID:    " + getEmpId() +
                "\nName:      " + getName() +
                "\nSSN:       " + getSsn() +
                "\nSalary:    " + NumberFormat.getCurrencyInstance().format(getSalary());
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }
}
