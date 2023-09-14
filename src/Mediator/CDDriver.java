package Mediator;

public class CDDriver extends Colleague{
    public CDDriver(Mediator mediator) {
        //这里继承父类有参构造
        super(mediator);
    }
    //光驱读取的数据
    private String data="";
    public String getData(){
        return this.data;
    }
    //读取光盘行为
    public void readCD(){
        //定义待播放的数据
        this.data="电影,声音";
        //通知主板，自己的状态发生改变
        this.getMediator().changed(this);
    }
}
