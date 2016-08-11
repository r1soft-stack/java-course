package training.daytwo.practice52.fabioq;

/**
 * Created by quinzif on 11/08/2016.
 */
public class Customer {

    private String name;
    private Branch branch;

    public Customer(String name, Branch branch) {
        this.name = name;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
