package TemplateMethod;

public class NormalLogin extends LoginTemplate {

    //普通用户的登录

    @Override
    public LoginModel findLoginUser(String loginId) {
        //这里直接返回我们设定好的用户信息，代替数据库
        LoginModel model = new LoginModel();
        model.setLoginId(loginId);
        model.setPwd("123456");
        return model;
    }
}
