package AbstractFactory;

public class Engineer3 {
    private CPUApi cpu=null;
    private MemoryApi mem=null;
    private MainBoardApi board=null;

    public void makeComputer(AbstractFactory3 schema3){
        this.cpu=(CPUApi) schema3.createProduct(1);
        this.board=(MainBoardApi) schema3.createProduct(2);
        this.mem=(MemoryApi) schema3.createProduct(3);

        this.mem.installMemory();
        this.board.installCPU();
        this.cpu.calculate();
    }
}
