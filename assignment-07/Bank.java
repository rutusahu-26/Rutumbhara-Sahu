
class InsufficientBalance extends Exception {
    InsufficientBalance(String msg) {
        super(msg);
    }
}
public class Bank {
    public static void main(String[] args) {
        int balance = 5000, withdraw = 7000;
        try {
            if (withdraw > balance) {
                throw new InsufficientBalance("Insufficient Balance");
            }
            balance = balance - withdraw;
            System.out.println("Withdrawal successful");
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }
    }
}
