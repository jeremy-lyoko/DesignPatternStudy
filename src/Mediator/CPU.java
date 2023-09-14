package Mediator;

public class CPU extends Colleague{
    public CPU(Mediator mediator) {
        super(mediator);
    }
    private String videoData = "";//分析出来的视频数据
    private String soundData = "";
    public String getVideoData() {
        return videoData;
    }
    public String getSoundData() {
        return soundData;
    }
    public void executeData(String data) {
        //把传入数据分解来，前面是视频，后面是音频
        String[] ss = data.split(",");
        this.videoData = ss[0];
        this.soundData = ss[1];
        //通知主板
        this.getMediator().changed(this);
    }

}
