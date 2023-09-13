package Builder;

import java.util.Collection;
import java.util.Map;

public class TxtBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();

    public void buildBody(Map<String, Collection<ExportDataMode1>> mapData) {
        //拼接文件体
        for (String tblName : mapData.keySet()) {
            buffer.append(tblName + "\n");//拼接表内容，添加表名
            for (ExportDataMode1 edm : mapData.get(tblName)) {
                //遍历value（集合），添加集合元素
                buffer.append(edm.getProductId() + "," + edm.getPrice() + "," + edm.getAmount() + "\n");
            }
        }
    }

    public void buildHeader(ExportHeaderMode1 ehm) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(ehm.getDepId() + "," + ehm.getExportDate() + "\n");

    }

    public void buildFooter(ExportFooterMode1 efm) {
        //拼接文件尾
        buffer.append(efm.getExporterUser());
    }
    public StringBuffer getResult(){
        return buffer;
    }
}
