package Mediator;

public class VideoCard extends Colleague{

    public VideoCard(Mediator mediator) {
        super(mediator);
    }
    public void showData(String data) {
        System.out.println("正在播放"+data);
    }
}
