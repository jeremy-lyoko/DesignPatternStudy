package Prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
    //提供原型编号和对象的对应关系
    private static Map<String,OrderApi> map=new HashMap<>();
    private PrototypeManager(){}//私有化构造，本类是工具类
    public synchronized static void setPrototype(String id,OrderApi prototype){
        map.put(id,prototype);
    }
    public synchronized static void getPrototype(){}
    public synchronized static void removePrototype(){}

}
