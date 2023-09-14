package Prototype;

public interface OrderApiNew {
    public int getOrderProductNum();
    public void setOrderProductNum(int num);
    //克隆方法
    public OrderApiNew cloneOrder();
}
