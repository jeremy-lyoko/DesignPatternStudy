package AbstractFactory;

import FacadePattern.Presentation;

import javax.print.attribute.standard.SheetCollate;

public class Engineer2 {
    private CPUApi cpu=null;
    private MainBoardApi mainBoard=null;

    public void makeComputer(AbstractFactory schema){
        prepareHardwares(schema);
    }

    private void prepareHardwares(AbstractFactory schema) {
        this.cpu=schema.createCPUApi();
        this.mainBoard= schema.createMainboardApi();
        this.cpu.calculate();
        this.mainBoard.installCPU();
    }

}
