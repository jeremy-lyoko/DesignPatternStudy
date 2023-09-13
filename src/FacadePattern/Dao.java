package FacadePattern;

public class Dao {
    public void generate() {
        ConfigModel model = ConfigManager.getInstance().getConfigDetail();
        if (model.getNeedDao()) {
            System.out.println("xxx");
        }
    }
}
