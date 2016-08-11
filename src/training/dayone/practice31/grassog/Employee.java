package training.dayone.practice31.grassog;

import java.text.NumberFormat;

/**
 * Created by grassog on 10/08/2016.
 */
public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double  salary;

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( !(name == "" || name == null) ){
            this.name = name;
        }
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(int empId, String name, String ssn, double salary){
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;

    }

    public void raiseSalary(double increase){
        if( increase > 0) {
            this.salary += increase;
        }
    }

    @Override
    public String toString() {
        return "EmpId: " + getEmpId() + "\nName: " + getName() + "\nSSN: " + getSsn() + "\nSalary: " + NumberFormat.getCurrencyInstance().format(getSalary());
    }

    /*
    public void printEmplyee(){
        System.out.println("EmployeeId: " + getEmpId()
                + " Name: " + getName()
                + " SSN: " + getSsn()
                + " Salary: " + NumberFormat.getCurrencyInstance().format(getSalary())
        );
    }*/

}
