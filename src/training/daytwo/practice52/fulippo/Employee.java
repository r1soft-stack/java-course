package training.daytwo.practice52.fulippo;


import java.text.NumberFormat;

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    private class BenefitsHelper{
        private final double bonusRate = 0.02;
        private final double withHolding = 0.07;

        
    }

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public void setName(String name){
        if(name != "" && name != null){
            this.name = name;
        }

    }

    public void raiseSalary( double raise ){
        if(raise > 0) {
            this.salary += raise;
        }
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

    @Override
    public String toString(){

        return String.format("Name: %s%nEmpId: %s%nSsn: %s%nSalary: %s%n",
                getName(), getEmpId(), getSsn(), NumberFormat.getCurrencyInstance().format(getSalary()));

    }
}
