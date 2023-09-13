package FactoryPattern;

public class Factory {
    public static API createAPI(int input) {
        API api = null;
        if (input == 1) {
            api = new ImplA();
        }
        if (input == 2) {
            api = new ImplB();
        }
        return api;
    }
}
