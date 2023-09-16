package Strategy;

public class NormalCustomerStrategy implements Strategy{

    @Override
    public double calPrice(double goodsPrice) {
        System.out.println("普通客户，没有折扣");
        return goodsPrice;
    }
}
