package Observer;

public class Client {
    public static void main(String[] args) {
        NewsPaper subject = new NewsPaper();//报纸

        Reader r1=new Reader();
        Reader r2=new Reader();
        r1.setName("张三");
        r2.setName("lily");

        subject.attach(r1);
        subject.attach(r2);
        //设置更新内容，也是触发update方法的入口
        subject.setContent("2023.9月天气预测");
    }
}
