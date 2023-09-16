package Decorator;

public class Client {
    public static void main(String[] args) {
        Component c1 = new ConcreteComponent();//基本奖金的类
        //等待被装饰

        //对基本奖金进行装饰
        Decorator d1 = new MonthPrizeDecorator(c1);
        Decorator d2 = new SumPrizeDecorator(d1);

        System.out.println("张三奖金：" + d2.calPrize("张三", null, null));
        System.out.println("李四奖金：" + d2.calPrize("李四", null, null));

        Decorator d3=new GroupPrizeDecorator(d2);
        System.out.println("王武："+d3.calPrize("王武",null,null));
    }
}
