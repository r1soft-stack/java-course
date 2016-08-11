package training.daytwo.practice52.fulippo;


public class EmployeeStockPlan {

    public int grantStock(Employee e){

        if(e instanceof Engineer){
            return 10;
        } else if(e instanceof Admin){
            return 100; }
        else if(e instanceof Director){
            return 10000;
        } else if(e instanceof Manager){
            return 1;
        }

        return 0;
    }

}
