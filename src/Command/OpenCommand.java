package Command;

public class OpenCommand implements CommandApi {
    //这个命令类实际上是客户-主板之间的中间层
    //隔离了客户-主板
    private MainBoardApi mainBoard = null;
    public OpenCommand(MainBoardApi m) {
        this.mainBoard = m;
    }

    public void execute() {
        this.mainBoard.open();
    }
}
