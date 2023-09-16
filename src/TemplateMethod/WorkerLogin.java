package TemplateMethod;

public class WorkerLogin extends LoginTemplate{
    //工作人员
    @Override
    public LoginModel findLoginUser(String loginId) {
        LoginModel login = new LoginModel();
        login.setLoginId(loginId);
        login.setPwd("asdfg");
        return login;
    }
    public String encryptPassword(String password) {
        //覆盖父类的加密方法
        System.out.println("使用sha256加密");
        return password;
    }

}
