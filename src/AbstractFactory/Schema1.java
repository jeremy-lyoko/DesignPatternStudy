package AbstractFactory;

public class Schema1 implements AbstractFactory{
    @Override
    public CPUApi createCPUApi() {
        return new IntelCpu(1156);
    }

    @Override
    public MainBoardApi createMainboardApi() {
        return new GaMainboard(1156);
    }
}
