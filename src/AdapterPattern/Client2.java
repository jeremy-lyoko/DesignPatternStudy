package AdapterPattern;

import java.util.ArrayList;
import java.util.List;

public class Client2 {
    public static void main(String[] args) {
        LogMode1 lm1=new LogMode1();
        lm1.setLodId("001");
        lm1.setUser("admin");
        lm1.setTime("2023-09-12 10:27:58");
        lm1.setLogContent("some logs");


        LogFileOperateApi fileApi=new LogFileOperate("");

        LogDbOperateApi dbApi=new Adapter(fileApi);

        dbApi.createLog(lm1);

        List<LogMode1> readLog=dbApi.getAll();
        System.out.println("日志内容为："+readLog);
    }
}
