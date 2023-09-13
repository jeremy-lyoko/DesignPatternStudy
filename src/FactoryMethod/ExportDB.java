package FactoryMethod;

public class ExportDB implements ExportFileApi{
    @Override
    public boolean export(String data) {
        System.out.println("导出"+data+"到数据库备份文件");
        return true;
    }
}
