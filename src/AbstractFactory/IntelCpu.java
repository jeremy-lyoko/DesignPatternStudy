package AbstractFactory;

public class IntelCpu implements CPUApi{
    private int pins=0;
    public IntelCpu(int pins) {
        this.pins=pins;
    }
    public void calculate(){
        System.out.println("现在是intel cpu，针脚数目："+pins);
    }
}
