package AbstractFactory;

public class Client3 {

    public static void main(String[] args) {
        Engineer3 engineer3=new Engineer3();
        AbstractFactory3 sche=new Schema3();
        engineer3.makeComputer(sche);
    }

}
