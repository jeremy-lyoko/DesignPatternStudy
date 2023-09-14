package Mediator;

public abstract class Colleague {
    //定义所有同事的抽象父类
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
