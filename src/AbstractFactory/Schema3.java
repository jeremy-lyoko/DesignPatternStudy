package AbstractFactory;

public class Schema3 implements AbstractFactory3 {
    @Override
    public Object createProduct(int type) {
        Object o = null;
        switch (type) {
            case 1:
                o = new IntelCpu(1163);
                break;
            case 2:
                o = new MsiMainboard(1163);
                break;
            case 3:
                o = new MemoryDDr4(16);
                break;
            default:
                System.out.println("error type");
        }
        return o;
    }
}
