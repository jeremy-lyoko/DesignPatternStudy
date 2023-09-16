package TemplateMethod;

public abstract class LoginTemplate {
    //算法骨架，控制登录的模版
    //数据以loginModel的格式存放
    public abstract LoginModel findLoginUser(String loginId);//根据id查找对应的模型

    public String encryptPassword(String password) {
        //对密码加密，返回加密后的pwd
        return password;
    }

    public boolean match(LoginModel model, LoginModel dbModel) {
        //判断两个模型id和pwd相等
        if (model.getLoginId().equals(dbModel.getLoginId()) && model.getPwd().equals(dbModel.getPwd())) {
            return true;
        }
        return false;
    }

    public final boolean login(LoginModel model) {
        //传入model，调用它自身的方法，获得id
        //根据id调用模版方法，获得数据库里存储的模型
        //比较传入模型，和数据库里的模型是否一致
        LoginModel dbModel = this.findLoginUser(model.getLoginId());
        if (dbModel != null) {
            String encryptPassword = this.encryptPassword(model.getPwd());
            model.setPwd(encryptPassword);
            return this.match(model, dbModel);
        }
        return false;
    }
}
