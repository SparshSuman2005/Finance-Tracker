import java.util.ArrayList;

public class FinanceTracker {
    private ArrayList<Transaction> transactions;

    public FinanceTracker() {
        this.transactions = new ArrayList<>();
    }

    // Add a transaction to the tracker while keeping list integrity intact.
    public void addTransaction(Transaction t) {
        if (t != null) {
            transactions.add(t);
        }
    }
}
