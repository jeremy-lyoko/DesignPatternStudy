package Proxy;

import java.util.List;

public class Client2 {
    public static void main(String[] args) {
        //这里使用代理类来new对象
        EmployeeData employeeData = new Proxy();
        //正常获取全部人员，但是方法已被代理篡改
        List<Employee> list = employeeData.getAllEmployees();

        for (Employee e : list) {
            System.out.println(e);
        }

    }
}
