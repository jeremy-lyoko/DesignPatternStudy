package TemplateMethod;

public class Client {
    public static void main(String[] args) {
        //准备人员信息
        LoginModel model = new LoginModel();
        model.setPwd("asdfg");
        model.setLoginId("admin");

        //用来判断的对象
        LoginTemplate l1 = new WorkerLogin();
        LoginTemplate l2 = new NormalLogin();

        //测试登录
        boolean flag = l1.login(model);
        boolean flag2 = l2.login(model);

        System.out.println("工作人员登录："+flag);
        System.out.println("普通人员登录："+flag2);
    }
}
