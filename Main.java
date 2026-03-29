import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FinanceTracker tracker = new FinanceTracker();
        int nextId = 1;

        while (true) {
            System.out.println("\n=== Finance Tracker ===");
            System.out.println("1. Add Transaction");
            System.out.println("2. View Balance");
            System.out.println("3. View History");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter type (INCOME/EXPENSE): ");
                    String type = scanner.nextLine();

                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();

                    System.out.print("Enter date: ");
                    String date = scanner.nextLine();

                    Transaction transaction = new Transaction(nextId++, amount, category, date, type);
                    tracker.addTransaction(transaction);
                    System.out.println("Transaction added successfully!");
                    break;
                case 2:
                    double balance = tracker.getBalance();
                    System.out.printf("Current Balance: $%.2f%n", balance);
                    break;
                case 3:
                    for (Transaction t : tracker.getAllTransactions()) {
                        System.out.println(t.toString());
                    }
                    break;
                case 4:
                    System.out.println("Feature pending");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
