package ResponibleChain;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new BossManager();
        Handler h2 = new DepManager();
        Handler h3 = new ProjectManager();
        //组装职责链
        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        System.out.println(h3.handleRequest("张三",200));
        System.out.println(h3.handleRequest("张三",600));
        System.out.println(h3.handleRequest("abc",600));
        System.out.println(h3.handleRequest("张三",2000));
    }
}
