package Decorator;

import java.util.Date;

public class GroupPrizeDecorator extends Decorator{
//团队奖金
    public GroupPrizeDecorator(Component c) {
        super(c);
    }
    public double calPrize(String user, Date begin, Date end){
        double money=super.calPrize(user, begin, end);

        double group=0.0;
        //遍历团队销售额，做累加
        for(double i:TempDB.mapMonthSaleMoney.values()){
            group+=i;
        }
        double prize=group*0.01;
        System.out.println("当月团队奖金："+user+prize);
        return money+prize;
    }
}
