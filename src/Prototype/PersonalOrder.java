package Prototype;

public class PersonalOrder implements OrderApiNew {

    private String customerName;
    private String productId;
    private int orderProductNum=0;


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }


    public int getOrderProductNum() {
        return orderProductNum;
    }
    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }

    @Override
    public OrderApiNew cloneOrder() {
        // 创建一个新的 PersonalOrder 对象，并将当前对象的属性复制到新对象中
        PersonalOrder order = new PersonalOrder();
        order.setProductId(this.getProductId());
        order.setOrderProductNum(this.getOrderProductNum());
        order.setCustomerName(this.getCustomerName());
        return order;
    }

    public String toString() {
        return "PersonalOrder{customerName = " + customerName + ", productId = " + productId + ", orderProductNum = " + orderProductNum + "}";
    }
}
