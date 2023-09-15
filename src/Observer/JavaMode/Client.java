package Observer.JavaMode;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.security.auth.Subject;

public class Client {
    public static void main(String[] args) {
        Reader j1= new Reader();
        j1.setName("李四");
        NewsPaper newsPaper=new NewsPaper();

        newsPaper.addObserver(j1);

        newsPaper.setContent("更新了亚运信息");
    }
}
