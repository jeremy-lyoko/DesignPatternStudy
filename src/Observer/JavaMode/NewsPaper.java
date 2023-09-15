package Observer.JavaMode;

public class NewsPaper extends java.util.Observable{
    private String content;
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content=content;
        this.setChanged();
        //推模式
        this.notifyObservers(this.content);
        //拉模式用这个：this.notifyObservers();
    }
}
