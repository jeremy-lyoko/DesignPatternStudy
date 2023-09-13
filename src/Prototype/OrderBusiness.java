package Prototype;

public class OrderBusiness {
    //处理订单的业务对象

    public void saveOrder(OrderApi order) {
        //循环判断产品数量，大于1000需要新开一份订单
        while (order.getOrderProductNum() > 1000) {
            //新建订单
            OrderApi newOrder = null;
            //判断传入的实例是哪个实现类的
            if (order instanceof PersonalOrder) {

                PersonalOrder p2 = new PersonalOrder();
                PersonalOrder p1 = (PersonalOrder) order;

                //新订单的属性和传入订单的属性保持一致
                //订单产品数设为1000
                p2.setCustomerName(p1.getCustomerName());
                p2.setOrderProductNum(1000);
                p2.setProductId(p1.getProductId());

                newOrder = p2;
            } else if (order instanceof EnterpriseOrder) {
                EnterpriseOrder e2 = new EnterpriseOrder();
                EnterpriseOrder e1 = (EnterpriseOrder) order;

                e2.setEnterpriseName(e1.getEnterpriseName());
                e2.setOrderProductNum(1000);
                e2.setProductId(e1.getProductId());

                newOrder = e2;
            }
            //原本的订单-1000
            order.setOrderProductNum(order.getOrderProductNum()-1000);
            System.out.println("拆分订单："+newOrder);
        }
        System.out.println("below 1000");
    }
}
