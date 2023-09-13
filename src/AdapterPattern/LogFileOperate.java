package AdapterPattern;

import java.io.*;
import java.util.List;

public class LogFileOperate implements LogFileOperateApi {
    private String logFilePath = "AdapterPattern/AdapterLog.log";

    public LogFileOperate(String s) {
        //trim方法用于去除字符串空格
        if (s != null && s.trim().length() > 0) {
            this.logFilePath = s;
        }
    }

    @Override
    public List<LogMode1> readLogFile() {
        //创建list集合、object输入流
        //注意要赋初值null
        List<LogMode1> list = null;
        ObjectInputStream oin = null;
        try {
            //生成file对象
            File f = new File(logFilePath);
            if (f.exists()) {

                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
                //oin 是一个对象输入流，它用于从输入源中读取对象数据
                // readObject() 方法是对象输入流的一个方法，用于从输入流中读取一个序列化的对象
                list = (List<LogMode1>) oin.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oin != null) {
                    oin.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    @Override
    public void writeLogFile(List<LogMode1> list) {
        File f = new File(logFilePath);
        ObjectOutputStream oout = null;
        try {
            oout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
            oout.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
