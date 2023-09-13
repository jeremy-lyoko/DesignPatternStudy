package AbstractFactory;

public class ComputerEngineer {
    private CPUApi cpu = null;
    private MainBoardApi mainBoard = null;

    public void makeComputer(int cpuType, int mainboardType) {
        prepareHardwares(cpuType,mainboardType);
    }

    private void prepareHardwares(int cpuType, int mainboardType) {
        this.cpu=CPUFactory.createCPUApi(cpuType);
        this.mainBoard=MainboardFactory.createMainboard(mainboardType);
        this.cpu.calculate();
        this.mainBoard.installCPU();
    }
}
