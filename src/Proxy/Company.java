package Proxy;

import java.util.ArrayList;
import java.util.List;

public class Company {
    //公司类
    //维护一个list集合来保存员工
    private List<Employee> employeeList=new ArrayList<>();
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public void printAllEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
