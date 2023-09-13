package FactoryMethod;

public class Client {
    public static void main(String[] args) {
        ExportOperate operate=new ExportDBOperate();

        operate.export("业务数据");
    }
}
