package Command;

public class Client {
    public static void main(String[] args) {
        //模拟组装的过程
        //主板、命令、机箱，机箱按下开机按钮
        MainBoardApi mainBoard = new GigaMainBoard();

        OpenCommand openCommand = new OpenCommand(mainBoard);
        ShutdownCommand shutdownCommand = new ShutdownCommand(mainBoard);

        Box box = new Box();
        box.setOpenCommand(openCommand);//传入开机命令对象
        box.openButton();

        box.setShutdownCommand(shutdownCommand);//传入关机
        box.shutdownButton();
    }
}
