import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileHandler {
    public static final String FILENAME = "finance_data.txt";

    public static void saveTransactions(List<Transaction> list) {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(FILENAME))) {
            for (Transaction t : list) {
                writer.printf("%d,%s,%s,%s,%s%n",
                        t.getId(),
                        t.getAmount(),
                        t.getCategory(),
                        t.getDate(),
                        t.getType());
            }
        } catch (IOException e) {
            System.err.println("Error saving transactions: " + e.getMessage());
        }
    }
}
