package Prototype;

public class PersonalOrder implements OrderApi {

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

    public String toString() {
        return "PersonalOrder{customerName = " + customerName + ", productId = " + productId + ", orderProductNum = " + orderProductNum + "}";
    }
}
