package Singleton;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        AppConfig config=AppConfig.getInstance();
        String paramA= config.getParameterA();
        String paramB= config.getParameterB();
        System.out.println(paramA+"\n"+paramB);
    }
}
