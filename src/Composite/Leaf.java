package Composite;

public class Leaf extends Component {
    //叶子对象
    private String name = "";
    public Leaf(String n) {
        this.name = n;
    }
    @Override
    public void printStruct(String preStr) {
        //输出叶子对象的结构，但是叶子并没有下级，所以输出对象本身的名字
        System.out.println(preStr+"-"+name);
    }
}
