package Prototype;

public class OrderBusiness {
    //处理订单的业务对象

    public void saveOrder(OrderApiNew order) {
        //循环判断产品数量，大于1000需要新开一份订单
        while (order.getOrderProductNum() > 1000) {
            //新建订单
            OrderApiNew newOrder = order.cloneOrder();

            newOrder.setOrderProductNum(1000);
            //原本的订单-1000
            order.setOrderProductNum(order.getOrderProductNum()-1000);
            System.out.println("拆分订单："+newOrder);
        }
        System.out.println("below 1000");
    }
}
