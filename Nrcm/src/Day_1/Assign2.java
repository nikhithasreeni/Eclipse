package Day_1;

public class Assign2 {
    public static void main(String[] args) {
        // Initial values for expenses and budget
        double budget = 15000;
        double rent = 5000;
        double groceries = 4000;
        double entertainment = 3000;
        
        // Calculate total expenses
        double totalExpenses = rent + groceries + entertainment;
        
        // Check if expenses are within budget and calculate savings based on total expenses
        double savings = (totalExpenses > 12000) ? 1000 : 500; // Use relational operator to calculate savings
        
        // Check if total expenses are within budget (Relational operator)
        String budgetStatus = (totalExpenses <= budget) ? "within the budget" : "over the budget";
        
        // Print results
        System.out.println("Total Expenses: ₹" + totalExpenses);
        System.out.println("Expenses are " + budgetStatus + ".");
        System.out.println("Savings this month: ₹" + savings);
    }
}
