package Decorator;

import java.util.Date;

public class Decorator extends Component{
    //装饰器接口，需要和被装饰对象继承同样的父类
    //持有组件对象
    protected Component c;

    public Decorator(Component c) {
        this.c = c;
    }

    @Override
    public double calPrize(String user, Date begin, Date end) {
        //转调组件对象的计算方法
        return c.calPrize(user, begin, end);
    }
}
