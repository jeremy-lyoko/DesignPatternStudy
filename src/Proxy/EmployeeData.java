package Proxy;

import java.util.List;

public interface EmployeeData {

    public List<Employee> getAllEmployees();
    //为客户端准备的接口，方法是返回员工集合
}
