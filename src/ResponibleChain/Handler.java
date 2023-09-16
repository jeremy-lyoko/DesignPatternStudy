package ResponibleChain;

public abstract class Handler {
    //领导对象的接口

    //设置自身的对象，用来传入下一位领导的对象
    protected Handler successor = null;
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    //业务方法，申请经费
    public abstract String handleRequest(String user,double money);
}
