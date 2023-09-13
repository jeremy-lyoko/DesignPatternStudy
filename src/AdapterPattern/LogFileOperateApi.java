package AdapterPattern;

import java.util.List;

public interface LogFileOperateApi {
    //操作日志文件的接口
    //定义的方法有：读取、写入
    //定义了一个list集合，集合元素类型为logMode1
    public List<LogMode1> readLogFile();
    public void writeLogFile(List<LogMode1> list);
}
