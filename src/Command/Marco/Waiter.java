package Command.Marco;

public class Waiter {
    //服务员类，充当的invoker的角色，负责引用命令
    private MenuCommand menu = new MenuCommand();

    public void order(CommandApi commandApi) {
        CookApi hotCook = new HotCook();
        CookApi coolCook = new CoolCook();

        if(commandApi instanceof ChopCommand){
            ((ChopCommand) commandApi).setCookApi(hotCook);
            //热菜找热菜师傅
            //传入的命令对象设置持有的厨师，然后放入集合
        }
        menu.addMenu(commandApi);
    }
    public void afterOrder(){
        this.menu.execute();
        //命令集合完毕后开始执行
    }
}
