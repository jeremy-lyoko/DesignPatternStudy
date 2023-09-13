package AdapterPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        LogMode1 lm1=new LogMode1();
        lm1.setLodId("001");
        lm1.setUser("admin");
        lm1.setTime("2023-09-12 10:27:58");
        lm1.setLogContent("some logs");

        List<LogMode1> list=new ArrayList<LogMode1>();
        list.add(lm1);

        LogFileOperateApi api=new LogFileOperate("");
        api.writeLogFile(list);

        List<LogMode1> readLog=api.readLogFile();
        System.out.println("日志内容为："+readLog);
    }
}
