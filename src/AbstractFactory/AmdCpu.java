package AbstractFactory;

public class AmdCpu implements CPUApi{
    private int pins=0;
    public AmdCpu(int pins){
        this.pins=pins;
    }
    @Override
    public void calculate() {
        System.out.println("AMD YES!,针脚："+pins);
    }
}
