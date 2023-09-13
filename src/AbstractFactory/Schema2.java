package AbstractFactory;

public class Schema2 implements AbstractFactory {
    public CPUApi createCPUApi() {
        return new AmdCpu(939);
    }

    public MainBoardApi createMainboardApi() {
        return new MsiMainboard(939);
    }
}
