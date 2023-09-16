package Decorator;

import java.util.Date;

public class SumPrizeDecorator extends Decorator {
    //计算累计奖金
    public SumPrizeDecorator(Component c) {
        super(c);
    }

    public double calPrize(String user, Date begin, Date end) {
        double money = super.calPrize(user, begin, end);

        double prize = 10000;
        System.out.println("累计奖金" + user + prize);
        return money + prize;
    }
}
