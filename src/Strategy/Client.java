package Strategy;

public class Client {
    public static void main(String[] args) {
        Strategy boss = new BossCustomerStrategy();

        //价格类传入策略对象
        //这意味着客户端需要知道有哪几种策略
        Price price = new Price(boss);

        double price1 = price.getPrice(1000);
        System.out.println(price1);
    }
}
