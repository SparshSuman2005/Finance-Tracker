public class Transaction {
    private int id;
    private double amount;
    private String category;
    private String date;
    private String type;

    public Transaction(int id, double amount, String category, String date, String type) {
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s: $%.2f (%s)", date, type, amount, category);
    }
}
