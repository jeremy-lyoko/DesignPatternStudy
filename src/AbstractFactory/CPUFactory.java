package AbstractFactory;

public class CPUFactory {
    public static CPUApi createCPUApi(int i) {
        CPUApi cpu = null;
        if (i == 1) {
            cpu = new IntelCpu(1156);
        } else if (i == 2) {
            cpu = new AmdCpu(939);
        }
        return cpu;
    }
}
