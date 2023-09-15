package Iterator;

public class ArrayIterator implements Iterator {
    private SalaryManager manager = null;//持有工资管理对象，内部是数组
    private int index = -1;//迭代器开始的索引

    public ArrayIterator(SalaryManager m) {
        this.manager = m;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < this.manager.size()) {
            index = index + 1;
        }
    }

    @Override
    public boolean isDone() {
        if (index == this.manager.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return this.manager.get(index);
    }
}
