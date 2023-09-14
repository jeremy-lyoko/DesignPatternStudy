package Prototype;

public class EnterpriseOrder implements OrderApiNew {
    private String enterpriseName;
    private String productId;
    private int orderProductNum=0;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
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
        EnterpriseOrder order=new EnterpriseOrder();
        order.setProductId(this.getProductId());
        order.setOrderProductNum(this.getOrderProductNum());
        order.setEnterpriseName(this.getEnterpriseName());
        return order;
    }

    public String toString() {
        return "EnterpriseOrder{enterpriseName = " + enterpriseName + ", productId = " + productId + ", orderProductNum = " + orderProductNum + "}";
    }
}
