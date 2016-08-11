package training.dayone.practice31.grassog;

/**
 * Created by grassog on 11/08/2016.
 */
public class EmployeeStockPlan {

    public int grantStock(Employee employee){

        if (employee instanceof Director){
            return 1000;
        }else if (employee instanceof Manager){
            return 100;
        }

        return 10;
    }

}
