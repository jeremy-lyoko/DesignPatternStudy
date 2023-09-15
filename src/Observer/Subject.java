package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Subject {
    //报纸出版方。主体
    //ob=observer=订阅者，所有订阅者都👀报社等报纸更新
    private List<Ob> readers = new ArrayList<Ob>();

    public void attach(Ob observer) {
        //将ob插入集合，意味着订阅者向报纸出版方申请注册
        readers.add(observer);
    }

    public void detach(Ob observer) {
        readers.remove(observer);
    }

    protected void notifyObservers() {
        //核心的广播通知方法
        //报纸出新类，需要通知集合里的ob们
        //遍历集合里的每个ob对象，让它们自己调用更新方法
        for (Ob reader : readers) {
            reader.update(this);
        }
    }
}
