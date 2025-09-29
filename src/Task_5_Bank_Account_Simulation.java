import java.util.ArrayList;
import java.util.Scanner;

    // Account class to handle bank operations
    class Account {
        private String accountHolder;
        private double balance;
        private ArrayList<String> transactionHistory;

        // Constructor
        public Account(String accountHolder, double initialBalance) {
            this.accountHolder = accountHolder;
            this.balance = initialBalance;
            this.transactionHistory = new ArrayList<>();
            transactionHistory.add("Account created with balance: $" + initialBalance);
        }

        // Deposit method
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                transactionHistory.add("Deposited: $" + amount + " | New Balance: $" + balance);
                System.out.println("✓ Successfully deposited $" + amount);
            } else {
                System.out.println("✗ Invalid deposit amount");
            }
        }

        // Withdraw method
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                transactionHistory.add("Withdrew: $" + amount + " | New Balance: $" + balance);
                System.out.println("✓ Successfully withdrew $" + amount);
            } else if (amount > balance) {
                System.out.println("✗ Insufficient funds. Current balance: $" + balance);
            } else {
                System.out.println("✗ Invalid withdrawal amount");
            }
        }

        // Check balance
        public void checkBalance() {
            System.out.println("\nCurrent Balance: $" + balance);
        }

        // Show transaction history
        public void showHistory() {
            System.out.println("\n--- Transaction History for " + accountHolder + " ---");
            if (transactionHistory.size() == 1) {
                System.out.println("No transactions yet (except account creation)");
            } else {
                for (String transaction : transactionHistory) {
                    System.out.println(transaction);
                }
            }
            System.out.println("Current Balance: $" + balance);
            System.out.println("-----------------------------------\n");
        }

        // Get account holder name
        public String getAccountHolder() {
            return accountHolder;
        }
    }

    // Main class with user interaction
    public class Task_5_Bank_Account_Simulation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Account account = null;

            System.out.println("╔════════════════════════════════════╗");
            System.out.println("║   WELCOME TO BANK SIMULATION       ║");
            System.out.println("╚════════════════════════════════════╝\n");

            // Create account
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter initial deposit amount: $");
            double initialDeposit = scanner.nextDouble();

            account = new Account(name, initialDeposit);
            System.out.println("\n✓ Account created successfully for " + name + "!");

            // Main menu loop
            boolean running = true;
            while (running) {
                System.out.println("\n═══════════ MENU ═══════════");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Check Balance");
                System.out.println("4. Transaction History");
                System.out.println("5. Exit");
                System.out.println("═══════════════════════════");
                System.out.print("Choose an option (1-5): ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // Deposit
                        System.out.print("\nEnter deposit amount: $");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;

                    case 2:
                        // Withdraw
                        System.out.print("\nEnter withdrawal amount: $");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;

                    case 3:
                        // Check balance
                        account.checkBalance();
                        break;

                    case 4:
                        // Show history
                        account.showHistory();
                        break;

                    case 5:
                        // Exit
                        running = false;
                        System.out.println("\n╔════════════════════════════════════╗");
                        System.out.println("║  Thank you for using our service!  ║");
                        System.out.println("║           Have a nice day!         ║");
                        System.out.println("╚════════════════════════════════════╝");
                        break;

                    default:
                        System.out.println("✗ Invalid option. Please choose 1-5.");
                }
            }

            scanner.close();
        }
    }

