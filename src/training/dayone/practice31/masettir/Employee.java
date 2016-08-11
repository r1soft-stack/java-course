package training.dayone.practice31.masettir;

import java.text.NumberFormat;

/**
 * Created by masettir on 10/08/2016.
 */
public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    /**
     *
     * @param empId
     * @param name
     * @param ssn
     * @param salary
     */
    public Employee (int empId, String name, String ssn, double salary){
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param increase
     */
    public void raiseSalary (double increase){
        this.salary = (this.salary + increase);
    }

    /**
     *
     */
    public void printEmployee (){
        System.out.printf("%nInformation about %s : salary %s, SSN %s, ID %d",
                this.name,
                NumberFormat.getCurrencyInstance().format(this.salary),
                this.ssn,
                this.empId
        );
    }
}
