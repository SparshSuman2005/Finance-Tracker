import java.io.File;
import java.util.ArrayList;

public class FinanceTracker {
    private ArrayList<Transaction> transactions;

    public FinanceTracker() {
        this.transactions = new ArrayList<>();
        if (new File(FileHandler.FILENAME).exists()) {
            this.transactions.addAll(FileHandler.loadTransactions());
        }
    }

    // Add a transaction to the tracker while keeping list integrity intact.
    public void addTransaction(Transaction t) {
        if (t != null) {
            transactions.add(t);
        }
    }

    // Calculate the balance by summing incomes and subtracting expenses.
    public double getBalance() {
        double total = 0.0;
        for (Transaction t : transactions) {
            if ("INCOME".equals(t.getType())) {
                total += t.getAmount();
            } else if ("EXPENSE".equals(t.getType())) {
                total -= t.getAmount();
            }
        }
        return total;
    }

    // Return a copy of all transactions.
    public ArrayList<Transaction> getAllTransactions() {
        return new ArrayList<>(transactions);
    }
}
