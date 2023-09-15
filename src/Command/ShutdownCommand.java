package Command;

public class ShutdownCommand implements CommandApi {
    private MainBoardApi mainBoard = new GigaMainBoard();

    public ShutdownCommand(MainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    public void execute() {
        mainBoard.shutdown();
    }
}
