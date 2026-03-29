/*
 * Transaction class represents a single financial transaction
 * @author Sparsh
 */

public class Transaction {
    
    // Private fields for encapsulation
    // Prevents direct external modification and allows controlled access through methods
    private int id;
    private double amount;
    private String category;
    private String date;
    private String type;
    
    /*
     * Constructor to initialize all transaction fields
     * @param id - unique identifier for the transaction
     * @param amount - transaction value
     * @param category - category of the transaction
     * @param date - transaction date
     * @param type - type of transaction (income/expense)
     */
    public Transaction(int id, double amount, String category, String date, String type) {
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.type = type;
    }
}
