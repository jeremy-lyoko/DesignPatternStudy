package Command;

public class GigaMainBoard implements MainBoardApi{
    public void open(){
        System.out.println("技嘉主板开机中");
    }
    public void shutdown() {
        System.out.println("主板关机中");
    }
}
