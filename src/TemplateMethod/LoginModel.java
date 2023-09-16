package TemplateMethod;

public class LoginModel {
    //统一登录的数据模型:id,passwd
    private String loginId;
    private String pwd;

    public String getLoginId() {
        return loginId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
