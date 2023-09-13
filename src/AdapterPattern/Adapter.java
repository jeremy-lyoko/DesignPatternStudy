package AdapterPattern;

import java.util.List;

public class Adapter implements LogDbOperateApi {
    //适配器需要持有被适配的接口对象
    //在重写的方法里，复用第一版接口实现类提供的方法
    private LogFileOperateApi adaptee;

    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void createLog(LogMode1 lm) {
        //读取文件内容
        //加入新的对象，然后写入
        List<LogMode1> list = adaptee.readLogFile();
        list.add(lm);
        adaptee.writeLogFile(list);
    }

    @Override
    public void updateLog(LogMode1 lm) {
        List<LogMode1> list = adaptee.readLogFile();
        //遍历list
        //判断list元素的序号与传入参数的序号是否相等，相等的话set lm
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLodId().equals(lm.getLodId())) {
                list.set(i, lm);
            }
        }
    }

    @Override
    public void removeLog(LogMode1 lm) {
        List<LogMode1> list = adaptee.readLogFile();
        list.remove(lm);
        adaptee.writeLogFile(list);
    }

    @Override
    public List<LogMode1> getAll() {
        return adaptee.readLogFile();
    }
}
