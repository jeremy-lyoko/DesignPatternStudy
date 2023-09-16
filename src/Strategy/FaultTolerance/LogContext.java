package Strategy.FaultTolerance;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class LogContext {
    //策略的使用者，日志文本类
    public void log(String msg) {
        //为了方便就直接在方法里new策略对象，而不是定义在成员变量里
        LogStrategy strategy = new DbLog();
        try {
            strategy.log(msg);
        } catch (Exception e) {
            //如果出异常，就用文件策略覆盖调这个对象
            strategy = new FileLog();
            strategy.log(msg);
        }
    }
}
