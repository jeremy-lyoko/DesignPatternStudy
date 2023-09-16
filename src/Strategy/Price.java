package Strategy;

public class Price {
    //价格类，持有策略对象
    //策略对象提供具体算法
    private Strategy strategy=null;
    public Price(Strategy strategy) {
        this.strategy = strategy;
    }
    public double getPrice(double price){
        //调用策略对象的计算方法
        return this.strategy.calPrice(price);
    }
}
