package Iterator;

public abstract class Aggregate {
    //抽象工厂，返回迭代器接口的对象

    //工厂方法服务于工资管理类，也就是两个集合类

    //由它们创建it接口对象
    public abstract Iterator createIterator();
}
