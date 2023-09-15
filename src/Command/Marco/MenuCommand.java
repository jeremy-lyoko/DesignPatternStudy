package Command.Marco;

import java.util.ArrayList;
import java.util.Collection;

public class MenuCommand implements CommandApi{
    //宏命令对象
    private Collection<CommandApi> menus = new ArrayList<CommandApi>();
    //菜单集合

    public void addMenu(CommandApi commandApi) {
        menus.add(commandApi);
    }
    public void execute(){
        //执行方法就是遍历每一个命令元素，让它们执行
        for(CommandApi commandApi:menus){
            commandApi.execute();
        }
    }
}
