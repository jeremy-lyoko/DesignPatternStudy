package AdapterPattern;

import java.io.Serializable;

public class LogMode1 implements Serializable {
    //第一版日志对象的格式
    //内容有：id、用户、时间、日志内容
    //由于要做流处理，所以必须继承序列化接口
    private String lodId;
    private String User;
    private String time;
    private String logContent;

    public LogMode1() {
    }

    public LogMode1(String lodId, String User, String time, String logContent) {
        this.lodId = lodId;
        this.User = User;
        this.time = time;
        this.logContent = logContent;
    }

    public String getLodId() {
        return lodId;
    }

    public void setLodId(String lodId) {
        this.lodId = lodId;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    public String toString() {
        return "LogMode1{lodId = " + lodId + ", User = " + User + ", time = " + time + ", logContent = " + logContent + "}";
    }
}
