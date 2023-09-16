package Decorator;

import java.util.Date;

public class ConcreteComponent extends Component{

    @Override
    public double calPrize(String user, Date begin, Date end) {
        //基础奖金为0
        return 0;
    }
}