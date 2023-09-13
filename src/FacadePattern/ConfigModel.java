package FacadePattern;

public class ConfigModel {
    //负责定义配置文件
    //配置的模型。包括配置的种类、每个配置的参数
    private boolean needPresentation = true;
    private boolean needBusiness = true;
    private boolean needDao = true;

    public boolean getNeedPresentation() {
        return this.needPresentation;
    }

    public boolean getNeedBusiness() {
        return this.needBusiness;
    }

    public boolean getNeedDao() {
        return this.needDao;
    }

    public void setNeedPresentation(boolean b) {
        this.needPresentation = b;
    }

    public void setNeedBusiness(boolean b) {
        this.needPresentation = b;
    }

    public void setNeedDao(boolean b) {
        this.needPresentation = b;
    }
}
