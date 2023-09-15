package Observer.JavaMode;

import java.util.Observable;

public class Reader implements java.util.Observer{
    private String name;
    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        //推模式，直接使用内容
        System.out.println(name+"收到新内容："+arg);

        //拉模式，用传入的对象获取内容
        System.out.println(((NewsPaper)o).getContent());
    }
}
