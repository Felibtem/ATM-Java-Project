import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        boolean running = true;

        while (running) {

            System.out.println("\n=== ATM MENU ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Balance");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter account number: ");
                String accNum = scanner.nextLine();

                System.out.print("Enter account holder name: ");
                String name = scanner.nextLine();

                bank.createAccount(accNum, name);

            } else if (choice == 2) {
                System.out.print("Enter account number: ");
                String accNum = scanner.nextLine();

                BankAccount account = bank.findAccount(accNum);

                if (account != null) {
                    System.out.print("Enter deposit amount: ");
                    double amount = scanner.nextDouble();
                    account.deposit(amount);
                } else {
                    System.out.println("Account not found.");
                }

            } else if (choice == 3) {
                System.out.print("Enter account number: ");
                String accNum = scanner.nextLine();

                BankAccount account = bank.findAccount(accNum);

                if (account != null) {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = scanner.nextDouble();
                    account.withdraw(amount);
                } else {
                    System.out.println("Account not found.");
                }

            } else if (choice == 4) {
                System.out.print("Enter account number: ");
                String accNum = scanner.nextLine();

                BankAccount account = bank.findAccount(accNum);

                if (account != null) {
                    account.displayAccountInfo();
                } else {
                    System.out.println("Account not found.");
                }

            } else if (choice == 5) {
                running = false;
                System.out.println("Thank you for using the ATM.");
            } else {
                System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
