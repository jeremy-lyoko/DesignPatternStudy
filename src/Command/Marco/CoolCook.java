package Command.Marco;

public class CoolCook implements CookApi {
    public void cook(String name) {
        System.out.println("厨师正在做" + name);
    }
}
