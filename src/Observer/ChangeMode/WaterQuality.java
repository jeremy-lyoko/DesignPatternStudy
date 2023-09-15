package Observer.ChangeMode;

public class WaterQuality extends WaterQualitySubject {
    //集合保存在父类
    //实现类里的属性是污染等级
    private int polluteLevel = 0;

    public int getPolluteLevel() {
        return polluteLevel;
    }

    public void setPolluteLevel(int polluteLevel) {
        this.polluteLevel = polluteLevel;
        this.notifyObs();
    }

    @Override
    public void notifyObs() {
        for (WaterOb waterOb : list) {
            //遍历集合，根据污染级别，选择通知观察者
            if (this.polluteLevel >= 0) {
                if ("监测人员".equals(waterOb.getJob()))
                    waterOb.update(this);
            }
            if (this.polluteLevel >= 1) {
                if ("领导".equals(waterOb.getJob())) {
                    waterOb.update(this);
                }
            }
        }
    }

    @Override
    public int getLevel() {
        return polluteLevel;
    }
}
