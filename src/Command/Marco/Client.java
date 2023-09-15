package Command.Marco;

public class Client {
    public static void main(String[] args) {


        //客户只需要面对服务员
        Waiter waiter1 = new Waiter();
        //命令被参数化，客户只知道菜的名字，不知道具体的厨师
        CommandApi chop = new ChopCommand();


        waiter1.order(chop);
        //点餐完毕
        waiter1.afterOrder();
    }
}