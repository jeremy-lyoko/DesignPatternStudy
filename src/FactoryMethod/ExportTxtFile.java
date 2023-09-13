package FactoryMethod;

public class ExportTxtFile implements ExportFileApi{
    @Override
    public boolean export(String data) {
        System.out.println("导出"+data+"到txt文件");
        return true;
    }
}
