package Mediator;

public interface Mediator {
    //同事对象在自身改变的时候通知中介者方法
    //传入同事对象，好让中介者获取同事对象的状态
    public void changed(Colleague colleague);
}
