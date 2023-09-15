package Command.Marco;

public class HotCook implements CookApi{
    //热菜厨师
    public void cook(String name) {
        System.out.println("厨师正在做"+name);
    }
}
