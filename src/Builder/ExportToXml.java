package Builder;

import java.util.Collection;
import java.util.Map;

public class ExportToXml {
    public void export(ExportHeaderMode1 ehm, Map<String, Collection<ExportDataMode1>> mapData, ExportFooterMode1 efm) {
        StringBuffer buffer = new StringBuffer();
        //1：先来拼接文件头的内容

        buffer.append(

                "<?xml version='1.0' encoding='gb2312'?>\n");
        buffer.append("<Report>\n");

        buffer.append(" <Header>\n");
        buffer.append(" <DepId>" + ehm.getDepId() + "</DepId>\n");
        buffer.append(" <ExportDate>" + ehm.getExportDate()
                + "</ExportDate>\n");
        buffer.append(" </Header>\n");

        //2：再来拼接文件体的内容
        buffer.append(" <Body>\n");
        for (String tblName : mapData.keySet()) { //先拼接表名称
            buffer.append("<Datas TableName=\"" + tblName + "\">\n");
            // 然后循环拼接具体数据
            for (ExportDataMode1 edm : mapData.get(tblName)) {
                buffer.append(" <Data>\n");
                buffer.append(" <ProductId>"
                        + edm.getProductId() + "</ProductId>\n");
                buffer.append(" <Price>" + edm.getPrice() + "</Price>\n");
                buffer.append(" <Amount>" + edm.getAmount() + "</Amount>\n");
                buffer.append(" </Data>\n");
            }
            buffer.append(" </Datas>\n");
        }
        buffer.append(" </Body>\n");

        //3.文件尾的拼接
        buffer.append("<Footer>\n");
        buffer.append("<ExportUser>" + efm.getExporterUser() + "</ExportUser>\n");
        buffer.append("</Footer>\n");
        buffer.append("</Reporter>\n");
        System.out.println("输出到xml的内容：\n" + buffer);
    }
}
