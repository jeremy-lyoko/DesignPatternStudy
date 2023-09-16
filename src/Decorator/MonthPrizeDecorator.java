package Decorator;

import java.util.Date;

public class MonthPrizeDecorator extends Decorator {
    //装饰器对象，计算当月业务奖金
    public MonthPrizeDecorator(Component c) {
        super(c);
    }

    public double calPrize(String user, Date begin, Date end) {
        double money = super.calPrize(user, begin, end);
        //先用父类方法把前面计算过的奖金计算出来

        double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;

        System.out.println("当月奖金" + user + prize);
        return money + prize;
    }
}

