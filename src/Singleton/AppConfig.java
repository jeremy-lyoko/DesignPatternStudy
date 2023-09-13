package Singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

    private static AppConfig config=new AppConfig();

    public static AppConfig getInstance(){
        return config;
    }
    private String parameterA;
    private String parameterB;

    public String getParameterA() {
        return parameterA;
    }

    public String getParameterB() {
        return parameterB;
    }

    private AppConfig() {
        readConfig();
    }

    private void readConfig() {
        Properties p = new Properties();
        InputStream in = null;
        //是一种在 Java 中使用类加载器（ClassLoader）加载资源文件的方式。
        // 具体来说，它用于获取类路径下的资源文件并返回一个输入流（InputStream）以供读取资源内容。
        try {
            in = AppConfig.class.getResourceAsStream("AppConfig.properties");
            p.load(in);
            this.parameterA = p.getProperty("paramA");
            this.parameterB = p.getProperty("paramB");
        } catch (IOException e) {
            System.out.println("error config");
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
