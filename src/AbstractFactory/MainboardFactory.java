package AbstractFactory;

public class MainboardFactory {
    public static MainBoardApi createMainboard(int type) {
        MainBoardApi mainboard = null;
        if (type == 1) {
            mainboard = new GaMainboard(1156);
        } else if (type == 2) {
            mainboard = new MsiMainboard(939);
        }
        return mainboard;
    }
}
