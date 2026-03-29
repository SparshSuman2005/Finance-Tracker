import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
                    break;
                case 2:
                    System.out.println("Feature pending");
                    break;
                case 3:
                    System.out.println("Feature pending");
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
