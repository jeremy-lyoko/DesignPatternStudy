package Mediator;

public class MainBoard implements Mediator {
    //主板类，实现中介接口
    private CDDriver cdDriver = null;
    private CPU cpu = null;
    private VideoCard videoCard = null;
    private SoundCard soundCard = null;

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    private void opeCPU(CPU cpu) {
        //cpu的工作方法
        //接收cpu对象，获取数据，用声卡显卡对象提供的方法播放
        String v = cpu.getVideoData();
        String s = cpu.getSoundData();
        this.videoCard.showData(v);
        this.soundCard.soundData(s);
    }

    private void opeCDDriverReadData(CDDriver cd) {
        //接收cd driver
        //获取数据，塞入cpu对象里，调用cpu类的方法
        //相当于利用中介转移到下一流程了
        String data = cd.getData();
        this.cpu.executeData(data);
    }

    @Override
    public void changed(Colleague colleague) {
        //流程：
        //入口是CDdriver，执行完之后会调用change方法提交自己对象
        //主板类收到对象后进行if判断

        if (colleague == cdDriver) {
            this.opeCDDriverReadData((CDDriver) colleague);
        } else if (colleague == cpu) {
            this.opeCPU((CPU) colleague);
        }
    }

}
