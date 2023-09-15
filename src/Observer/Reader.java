package Observer;

public class Reader implements Ob {
    private String name;

    @Override
    public void update(Subject subject) {
        //读者的实现类
        //读者自我调用更新方法，从传入的报纸类获取信息
        System.out.println(name + "收到新报纸，内容是：" + ((NewsPaper) subject).getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

