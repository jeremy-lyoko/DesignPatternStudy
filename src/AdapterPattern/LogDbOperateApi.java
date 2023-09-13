package AdapterPattern;

import java.util.List;

public interface LogDbOperateApi {
    //操作数据库日志的接口
    //定义了增删改查
    public void createLog(LogMode1 lm);

    public void updateLog(LogMode1 lm);

    public void removeLog(LogMode1 lm);

    public List<LogMode1> getAll();
}
