package AbstractFactory;

public class Client2 {
    public static void main(String[] args) {
        Engineer2 engineer2=new Engineer2();
        AbstractFactory intelGa=new Schema1();
        engineer2.makeComputer(intelGa);

        AbstractFactory AmdMsi=new Schema2();
        engineer2.makeComputer(AmdMsi);
    }
}
