package Proxy;

public class Employee {
    //员工类
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Employee{name = " + name + ", id = " + id + "}";
    }
}
