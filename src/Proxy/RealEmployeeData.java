package Proxy;

import java.util.ArrayList;
import java.util.List;

public class RealEmployeeData implements EmployeeData {
    //接口实现类，准备示例数据
    List<Employee> list = new ArrayList<>();

    public RealEmployeeData() {
    //在构造方法直接写入示例数据
        list.add(new Employee("张三", 1));
        list.add(new Employee("李四", 2));
        list.add(new Employee("张明", 3));
    }

    public List<Employee> getAllEmployees() {
        return list;
    }
}
