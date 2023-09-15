package Observer.ChangeMode;

public class WaterObMan implements WaterOb {
    private String job;
//观察者的实现类
    //update方法里采用拉模式，获取监控站点对象调用方法
    @Override
    public void update(WaterQualitySubject subject) {
        System.out.println(job+"收到警报，当前污染级别为："+subject.getLevel());
    }



    @Override
    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String getJob() {
        return job;
    }
}
