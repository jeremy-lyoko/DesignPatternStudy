package Iterator;

public class CollectionIterator implements Iterator{
    private PayManager manager=null;
    private int index = -1;
    public CollectionIterator(PayManager m){
        this.manager=m;
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
