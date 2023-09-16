package Strategy.FaultTolerance;

public class DbLog implements LogStrategy {

    @Override
    public void log(String msg) {
        if (msg != null && msg.trim().length() > 4) {
            int a = 5 / 0;//人为制造一个exception
        }
        System.out.println(msg + "存入数据库");
    }
}
