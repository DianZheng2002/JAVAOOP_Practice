public class Account {
    private static double interestRate = 0.035;  // 所有账户共享的利率
    private String id;  // 账号
    private double balance;  // 余额

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double annualInterest() {
        return balance * interestRate;
    }

    @Override
    public String toString() {
        return String.format("账号：%s，余额：%.2f元，年利息：%.2f元", id, balance, annualInterest());
    }

    // main方法用于测试
    public static void main(String[] args) {
        Account a1 = new Account("11111",1000);
        Account a2 = new Account("22222",2000);
        Account.setInterestRate(0.035);

        System.out.println(a1);
        System.out.println(a2);
    }
}
