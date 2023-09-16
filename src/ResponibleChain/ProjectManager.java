package ResponibleChain;

public class ProjectManager extends Handler {
    //领导：项目经理
    @Override
    public String handleRequest(String user, double money) {
        String str = "";
        if (money < 500) {
            //为了方便只同意一个人的
            if ("张三".equals(user)) {
                str = "项目经理批准" + user + money + "元";
            } else {
                str = "不同意";
            }
            return str;
        } else //级别不够，转交给下一位
        {
            if (this.successor != null) {
                return successor.handleRequest(user, money);
            }
        }
        return str;

    }
}
