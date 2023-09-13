package FacadePattern;

public class ConfigManager {
    //负责读取配置文件
    private static ConfigManager manager=null;
    private static ConfigModel model=null;
    private ConfigManager(){

    }

    public static ConfigManager getInstance(){
        if (manager==null){
            manager=new ConfigManager();
            model=new ConfigModel();
            //model本来是要输入参数值的，这里省略
            //这里是单例模式，将参数设置到model上去
        }
        return manager;
    }
    public ConfigModel getConfigDetail(){
        return model;
    }
}

