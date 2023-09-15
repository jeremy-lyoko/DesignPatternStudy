package Observer.ChangeMode;

public interface WaterOb {
    //水质观察者接口
    public void update(WaterQualitySubject w);
    //设置处理人员的职务
    public void setJob(String job);
    public String getJob();
}
