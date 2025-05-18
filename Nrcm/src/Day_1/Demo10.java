package Day_1;
class FixedAmount {
    public int fixedamount = 10000;
}
abstract class Withdrawal {
    abstract void withdraw(int amount);
}
public class Demo10 extends Withdrawal {
    FixedAmount f1 = new FixedAmount();

    void withdraw(int amount) {
        f1.fixedamount -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Available Balan[ce: " + f1.fixedamount);
    }
    public static void main(String[] args) {
        int amount = Integer.parseInt(args[0]);
        Demo10 d = new Demo10();
        d.withdraw(amount);
    }
}
