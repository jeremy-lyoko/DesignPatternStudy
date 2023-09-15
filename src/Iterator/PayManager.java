package Iterator;

import java.util.ArrayList;
import java.util.List;

public class PayManager extends Aggregate {
    //客户方已有的工资管理对象

    private List list = new ArrayList<>();//使用集合

    public List getPayList() {
        return list;
    }

    public void calPay() {
        //计算工资，并把工资信息输入本类的列表里
        PayModel model1 = new PayModel();
        //准备一些测试数据
        model1.setPay(3800);
        model1.setUserName("lee");

        PayModel model2 = new PayModel();
        model2.setPay(3901);
        model2.setUserName("Black");

        list.add(model2);
        list.add(model1);
    }

    public int size() {
        return this.list.size();
    }

    public Object get(int index) {
        Object obj = null;
        if (index < this.list.size()) {
            obj = this.list.get(index);
        }
        return obj;
    }

    @Override
    public Iterator createIterator() {
        //继承抽象工厂类，返回接口实现类的对象
        return new CollectionIterator(this);
    }
}
