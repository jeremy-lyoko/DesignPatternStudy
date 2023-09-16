package Decorator;

import java.util.HashMap;
import java.util.Map;

public class TempDB {
    //模拟数据库
    private TempDB(){}
    public static Map<String,Double> mapMonthSaleMoney=new HashMap<String, Double>();

    static {
        mapMonthSaleMoney.put("张三",1000.0);
        mapMonthSaleMoney.put("李四",20000.0);
        mapMonthSaleMoney.put("王武",60000.0);
    }
}
