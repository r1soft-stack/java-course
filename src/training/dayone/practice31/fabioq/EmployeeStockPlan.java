package training.dayone.practice31.fabioq;

/**
 * Created by quinzif on 11/08/2016.
 */
public class EmployeeStockPlan {

    public int grantStock(Employee e){
        if(e instanceof Director) {
            return 1000;
        }
        else if(e instanceof Manager){
            return 100;
        }
        else return 10;
    }
}
