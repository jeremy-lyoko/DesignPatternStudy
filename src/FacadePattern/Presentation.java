package FacadePattern;

public class Presentation {
    public void generate() {
        //1.读取配置文件
        //2.根据配置文件生成代码
        ConfigModel model = ConfigManager.getInstance().getConfigDetail();
        if (model.getNeedPresentation()) {
            System.out.println("正在生成相应代码");
        }
    }
}
