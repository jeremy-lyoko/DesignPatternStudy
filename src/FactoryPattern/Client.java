package FactoryPattern;

class ImplA implements API {
    @Override
    public void test(String s) {
        System.out.println("A的功能："+s
        );
    }
}
class ImplB implements API{
    public void test(String s){
        System.out.println("B的功能："+s);
    }
}

public class Client {
    public static void main(String[] args) {
        API api = new ImplA();
        api.test("hello?");

        API apiB = Factory.createAPI(2);
        apiB.test("function");
    }
}