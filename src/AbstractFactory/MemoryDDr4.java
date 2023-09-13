package AbstractFactory;

public class MemoryDDr4 implements MemoryApi{
    private int num=0;
    public MemoryDDr4(int i){
        this.num=i;
    }
    @Override
    public void installMemory() {
        System.out.println("使用ddr4:容量"+num+"g");
    }
}
