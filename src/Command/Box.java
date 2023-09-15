package Command;

public class Box {
    //机箱类
    //持有两个命令类的对象:open/shutdown
    private CommandApi openCommand;
    private CommandApi shutdownCommand;
    public void setOpenCommand(CommandApi openCommand) {
        this.openCommand = openCommand;
    }
    public void setShutdownCommand(CommandApi shut){
        this.shutdownCommand=shut;
    }
    public void openButton(){
        //模拟一个开机按钮方法
        //调用命令对象的方法
        //命令对象再去找主板
        openCommand.execute();
    }
    public void shutdownButton() {
        shutdownCommand.execute();
    }
}
