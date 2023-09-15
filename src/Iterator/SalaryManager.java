package Iterator;

public class SalaryManager extends Aggregate{
    //被收购的公司的工资管理类
    private PayModel[] pms = null;//用数组管理

    public PayModel[] getPays() {
        return pms;
    }

    public void calSalary() {
        //同样计算工资
        PayModel model1 = new PayModel();
        PayModel model2 = new PayModel();

        model1.setUserName("小李");
        model2.setUserName("丽萨");
        model1.setPay(2000);
        model2.setPay(3000);

        pms = new PayModel[2];
        pms[0] = model1;
        pms[1] = model2;
    }

    public int size() {
        return this.pms.length;
    }

    public Object get(int index) {
        Object obj=null;
        if(index < this.pms.length){
            obj = this.pms[index];
        }
        return obj;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(this);
    }
}
