package Builder;

import java.util.Collection;
import java.util.Map;

public class ExportToTxt {
    public void export(ExportHeaderMode1 ehm, Map<String, Collection<ExportDataMode1>> mapData,ExportFooterMode1 efm){
        //文件头、文件体集合、文件尾

        //拼接文件头
        StringBuffer buffer=new StringBuffer();
        buffer.append(ehm.getDepId()+","+ehm.getExportDate()+"\n");

        //拼接文件体
        for(String tblName:mapData.keySet()){
            buffer.append(tblName+"\n");//拼接表内容，添加表名
            for (ExportDataMode1 edm:mapData.get(tblName)){
                //遍历value（集合），添加集合元素
                buffer.append(edm.getProductId()+","+edm.getPrice()+","+edm.getAmount()+"\n");
            }
        }
        //拼接文件尾
        buffer.append(efm.getExporterUser());

        System.out.println("输出到文本的内容：\n"+buffer);
    }
}
