package Observer.ChangeMode;

public class ClientForWater {
    public static void main(String[] args) {
        WaterQuality sub = new WaterQuality();
        WaterOb ob1 = new WaterObMan();
        ob1.setJob("监测人员");
        WaterOb ob2 = new WaterObMan();
        ob2.setJob("领导");

        sub.attach(ob1);
        sub.attach(ob2);

        //设置不同污染程度，开启通知
        System.out.println("轻度污染时");
        sub.setPolluteLevel(0);

        System.out.println("重度污染时");
        sub.setPolluteLevel(999);
    }
}
