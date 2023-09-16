package Decorator;

import java.util.Date;

public abstract class Component {
    //计算奖金的组件的抽象类
    public abstract double calPrize(String user, Date begin, Date end);

}
