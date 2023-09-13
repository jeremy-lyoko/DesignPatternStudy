package AbstractFactory;

public class GaMainboard implements MainBoardApi{
    //技嘉主板
    private int cpuHoles=0;
    public GaMainboard(int cpuHoles){
        this.cpuHoles=cpuHoles;
    }
    @Override
    public void installCPU() {
        System.out.println("技嘉主板，cpu插槽孔数："+cpuHoles);
    }
}
