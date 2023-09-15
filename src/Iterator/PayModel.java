package Iterator;

public class PayModel {
    //统一的工资模型
    private String userName;
    private double pay;

    public PayModel() {
    }

    public PayModel(String userName, double pay) {
        this.userName = userName;
        this.pay = pay;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return pay
     */
    public double getPay() {
        return pay;
    }

    /**
     * 设置
     * @param pay
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString() {
        return "PayModel{userName = " + userName + ", pay = " + pay + "}";
    }
}
