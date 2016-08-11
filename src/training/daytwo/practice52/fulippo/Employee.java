package training.daytwo.practice52.fulippo;


import java.text.NumberFormat;

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;
    private BenefitsHelper bh;

    private class BenefitsHelper{
        private final double bonusRate = 0.02;
        private final double withholdingRate = 0.07;

        private double calcBonus (double salary){
            return bonusRate * salary;
        }

        private double calcWithHolding(double salary){
            return withholdingRate * salary;
        }
    }



    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;

        this.bh = new BenefitsHelper();
    }

    public double getBonus(){
        return bh.calcBonus(getSalary());
    }

    public double getWithHolding(){
        return bh.calcWithHolding(getSalary());
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
