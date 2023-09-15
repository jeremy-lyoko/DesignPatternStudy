package Command.Marco;

public class ChopCommand implements CommandApi{
    //属性里持有具体做菜的厨师对象
    private CookApi cookApi=null;
    public void setCookApi(CookApi cookApi) {
        //对象的创建不在构造，而是放到类set方法，因为要传入不同的对象。
        //这样不用每次换厨师都要新建一个命令类
        this.cookApi=cookApi;
    }
    public void execute() {
        this.cookApi.cook("兰州拉面");
    }
}
