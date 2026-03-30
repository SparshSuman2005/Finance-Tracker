# Finance Tracker

A simple command-line Java application for tracking personal income and expenses.

## Features

- Add income and expense transactions
- View current balance (income minus expenses)
- View transaction history
- Persistent storage using text files
- Input validation for user entries

## Requirements

- Java Development Kit (JDK) 8 or higher

## Compilation

Compile all Java files from the project directory:

```bash
javac *.java
```

## Running the Application

Run the compiled application:

```bash
java Main
```

## Usage

1. **Add Transaction** - Record a new income or expense entry
2. **View Balance** - Display the current balance (total income - total expenses)
3. **View History** - List all recorded transactions
4. **Exit** - Close the application

## Data Storage

Transaction data is stored in `finance_data.txt` in CSV format. The file is automatically loaded on startup and can be saved manually.

## Project Structure

```
Finance Tracker/
├── Main.java           # Entry point and user interface
├── FinanceTracker.java # Core business logic
├── Transaction.java    # Transaction data model
├── FileHandler.java    # File I/O operations
└── finance_data.txt    # Data storage (created on first save)
```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
