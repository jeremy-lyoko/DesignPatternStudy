package Observer;

public class NewsPaper extends Subject {
    //报社的子类：报纸
    //用来设置具体的报纸内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        //设置报纸内容
        //同时用一个notify方法通知各位读者们报纸更新了
        this.content = content;
        notifyObservers();
    }

}
