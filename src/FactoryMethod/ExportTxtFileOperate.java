package FactoryMethod;

public class ExportTxtFileOperate extends ExportOperate{
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportTxtFile();
    }
}
