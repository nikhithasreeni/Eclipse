package Day_1;

public class Assign1 {
    public static void main(String[] args) {
        // Initial balance and constants
        double balance = 5000;
        double deposit = 1500;
        double serviceFee = 100;
        double bonus = 200;
        int month = 1;

        // Month 1 operations
        balance = balance + deposit - serviceFee; // Deposit and service fee
        balance = balance + (bonus * (month % 5 == 0 ? 1 : 0)); // Bonus after every 5th month
        System.out.println("Balance after month 1: ₹" + balance);
        
        // Month 2 operations
        month = 2;
        balance = balance + deposit - serviceFee; // Deposit and service fee
        balance = balance + (bonus * (month % 5 == 0 ? 1 : 0)); // Bonus after every 5th month
        System.out.println("Balance after month 2: ₹" + balance);
        
        // Month 3 operations
        month = 3;
        balance = balance + deposit - serviceFee; // Deposit and service fee
        balance = balance + (bonus * (month % 5 == 0 ? 1 : 0)); // Bonus after every 5th month
        System.out.println("Balance after month 3: ₹" + balance);
        
        // Reward if balance exceeds ₹10,000 after 3 months
        balance = balance + (balance > 10000 ? balance * 0.02 : 0); // 2% reward if balance > 10000
        
        // Final balance after 3 months
        System.out.println("Final balance after 3 months: ₹" + balance);
    }
}

