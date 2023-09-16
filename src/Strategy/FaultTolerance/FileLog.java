package Strategy.FaultTolerance;

public class FileLog implements LogStrategy{
    @Override
    public void log(String msg) {
        System.out.println(msg+"存入文件");
    }
}
