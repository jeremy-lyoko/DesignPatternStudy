package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> childComponents = null;
    private String name = "";

    public Composite(String name) {
        this.name = name;
    }

    public void addChild(Component child){
        //延迟初始化
        if(childComponents == null){
            childComponents = new ArrayList<Component>();
        }
        childComponents.add(child);
    }
    @Override
    public void printStruct(String preStr) {
        //输出自己先
        System.out.println(preStr+"+"+this.name);
        //如果还有下级组件，就输出组件对象
        if(this.childComponents!=null){
            preStr=preStr+" ";//添加一个空格
            for(Component c:childComponents){
                //递归向下打印
                c.printStruct(preStr);
            }
        }
    }
}
