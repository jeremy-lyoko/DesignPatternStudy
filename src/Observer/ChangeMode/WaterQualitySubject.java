package Observer.ChangeMode;

import java.util.ArrayList;
import java.util.List;

public abstract class WaterQualitySubject {
    //由于要自定义广播方法，这里选择做一层抽象，由子类实现具体方法
    protected List<WaterOb> list=new ArrayList<WaterOb>();
    public void attach(WaterOb waterOb){
        list.add(waterOb);
    }
    public abstract void notifyObs();//广播方法
    public abstract int getLevel();//获取水质污染级别

}
