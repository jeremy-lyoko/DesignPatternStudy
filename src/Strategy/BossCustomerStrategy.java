package Strategy;

public class BossCustomerStrategy implements Strategy{

    @Override
    public double calPrice(double goodsPrice) {
        System.out.println("大客户对折");
        return goodsPrice*0.5;
    }
}
