package Builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        //准备测试数据
        ExportHeaderMode1 ehm = new ExportHeaderMode1();
        ehm.setDepId("一分公司");
        ehm.setExportDate("2010-05-18");
        Map<String, Collection<ExportDataMode1>> mapData = new HashMap<String, Collection<ExportDataMode1>>();
        Collection<ExportDataMode1> col = new ArrayList<ExportDataMode1>();
        ExportDataMode1 edm1 = new ExportDataMode1();
        edm1.setProductId("产品001号");
        edm1.setPrice(100);
        edm1.setAmount(80);
        ExportDataMode1 edm2 = new ExportDataMode1();
        edm2.setProductId("产品002号");
        edm2.setPrice(99);
        edm2.setAmount(55);
        //把数据组装起来
        col.add(edm1);
        col.add(edm2);
        mapData.put("销售记录表", col);
        ExportFooterMode1 efm = new ExportFooterMode1();
        efm.setExporterUser("张三");
        //输出到文本文件
        ExportToTxt toTxt=new ExportToTxt();
        toTxt.export(ehm,mapData,efm);
        //输出到xml文件
        ExportToXml toXml=new ExportToXml();
        toXml.export(ehm,mapData,efm);
    }
}
