package Proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements EmployeeData {
    //代理类，同样实现接口
    private EmployeeData realEmployeeData;

    //内部维护者real类，也是执行客户所需方法的类
    public Proxy() {
        realEmployeeData = new RealEmployeeData();
    }

    @Override
    public List<Employee> getAllEmployees() {
        //核心方法篡改为筛选方法
        //方法内创建两个集合
        //一个是当前全部，一个是筛选后存放的集合
        List<Employee> all = realEmployeeData.getAllEmployees();
        List<Employee> part = new ArrayList<>();

        for (Employee e : all) {
            if (e.getId() <= 2) {
                part.add(e);
            }
        }
        return part;
    }

}
