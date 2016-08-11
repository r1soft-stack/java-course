package training.daytwo.practice52.fabioq;

/**
 * Created by quinzif on 11/08/2016.
 */
public enum Branch {
    LA("Basic"),
    BOSTON("Loan"),
    BANGALORE("Full"),
    MUMBAI("Full");

    String serviceLevel;

    private Branch(String serviceLevel){
        this.serviceLevel = serviceLevel;
    }

    public String getServiceLevel(){
        return serviceLevel;
    }

    public void setServiceLevel(String servicel){
        this.serviceLevel = servicel;
    }
}
