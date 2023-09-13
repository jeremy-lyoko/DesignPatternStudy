package AbstractFactory;

public class MsiMainboard implements MainBoardApi{
    //微星主板
    private int cpuHoles=0;
    public MsiMainboard(int cpuHoles){
        this.cpuHoles=cpuHoles;
    }
    @Override
    public void installCPU() {
        System.out.println("微星主板，cpu插槽孔数："+cpuHoles);
    }
}