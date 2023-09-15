package Iterator;

public class Client {
    public static void main(String[] args) {
        PayManager payManager = new PayManager();//客户工资管理类，list集合
        payManager.calPay();//添加测试数据，进入集合

        test(payManager.createIterator());
        //先用工厂方法创建迭代器对象，然后test方法使用

        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calSalary();

        test(salaryManager.createIterator());
    }
    private static void test(Iterator it){
        //迭代遍历
        it.first();

        while (!it.isDone()){
            Object obj=it.currentItem();
            System.out.println(obj);
            it.next();
        }
    }
}
