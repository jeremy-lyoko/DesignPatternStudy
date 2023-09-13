package Prototype;

public class OrderClient{
    public static void main(String[] args) {
        PersonalOrder op=new PersonalOrder();
        op.setCustomerName("Tom");
        op.setOrderProductNum(2048);
        op.setProductId("p100");

        OrderBusiness ob=new OrderBusiness();
        ob.saveOrder(op);
    }
}
