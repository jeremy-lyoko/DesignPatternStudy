package Proxy;

import java.util.List;

public class Client {
    //客户类
    //手动存几个员工数据
    //直接用公司对象进行打印
    public static void main(String[] args) {
        Employee employee1 = new Employee("张三", 1);
        Employee employee2 = new Employee("李四", 2);
        Employee employee3 = new Employee("张明", 3);

        // 创建公司，向集合里添加员工
        Company company = new Company();
        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);
        //客户端实际上唯一只对接公司类
        company.printAllEmployees();
    }
}
