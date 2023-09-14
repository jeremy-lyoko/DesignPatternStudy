package Mediator;

public class Client {
    public static void main(String[] args) {
        MainBoard mainBoard = new MainBoard();
        //创建主板对象、各个同事对象

        //每个同事持有主板接口的对象，方便调用change方法提交自身对象
        CDDriver cd = new CDDriver(mainBoard);
        CPU cpu = new CPU(mainBoard);
        VideoCard vc = new VideoCard(mainBoard);
        SoundCard sc = new SoundCard(mainBoard);

        //主板对象传入所有的同事
        mainBoard.setCdDriver(cd);
        mainBoard.setCpu(cpu);
        mainBoard.setVideoCard(vc);
        mainBoard.setSoundCard(sc);

        //入口
        cd.readCD();
    }

}
