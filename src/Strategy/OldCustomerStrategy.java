package Strategy;

public class OldCustomerStrategy implements Strategy {
    public double calPrice(double goodsPrice) {
        System.out.println("老客户折扣10%");
        return goodsPrice * (0.9);
    }
}
