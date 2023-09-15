package Composite;

public class Client {
    public static void main(String[] args) {
        //定义测试数据
        //组合对象
        Component root = new Composite("服装");
        Component branch1=new Composite("男装");
        Component branch2=new Composite("女装");

        //叶子对象
        Component Leaf1 = new Leaf("衬衣");
        Component Leaf2 = new Leaf ("夹克");
        Component Leaf3 = new Leaf ("裙子");
        Component leaf4 = new Leaf ("套装");

        //按照树形结构摆放
        root.addChild(branch1);
        root.addChild(branch2);
        branch1.addChild(Leaf1);
        branch2.addChild(Leaf2);
        branch2.addChild(Leaf3);
        //输出整颗树
        root.printStruct("");
    }
}
