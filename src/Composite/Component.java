package Composite;

public abstract class Component {
    //组合对象和叶子对象的抽象父类
    public abstract  void printStruct(String preStr);

    public void addChild(Component child) {
        //添加组件对象
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
    public void removeChild(Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
    public Component getChild(int index) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
}
