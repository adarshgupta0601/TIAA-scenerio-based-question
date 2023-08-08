package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<BankAccount.BankAccount> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Account  2. Display All Accounts  3. Find Account by ID  4. Deposit  5. Withdraw  6. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    System.out.print("Enter Account Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();
                    BankAccount.BankAccount account = new BankAccount.BankAccount(id, name, balance);
                    accounts.add(account);
                    break;
                case 2:
                    System.out.println("All Accounts:");
                    for (BankAccount.BankAccount acc : accounts) {
                        System.out.println(acc);
                    }
                    break;
                case 3:
                    System.out.print("Enter Account ID to Find: ");
                    int searchId = scanner.nextInt();
                    BankAccount.BankAccount foundAccount = null;
                    for (BankAccount.BankAccount acc : accounts) {
                        if (acc.getId() == searchId) {
                            foundAccount = acc;
                            break;
                        }
                    }
                    if (foundAccount != null) {
                        System.out.println("Found Account: " + foundAccount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account ID for Deposit: ");
                    int depositId = scanner.nextInt();
                    BankAccount.BankAccount depositAccount = findAccount(accounts, depositId);
                    if (depositAccount != null) {
                        System.out.print("Enter Deposit Amount: ");
                        double depositAmount = scanner.nextDouble();
                        depositAccount.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Account ID for Withdrawal: ");
                    int withdrawId = scanner.nextInt();
                    BankAccount.BankAccount withdrawAccount = findAccount(accounts, withdrawId);
                    if (withdrawAccount != null) {
                        System.out.print("Enter Withdrawal Amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdrawAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static BankAccount.BankAccount findAccount(List<BankAccount.BankAccount> accounts, int id) {
        for (BankAccount.BankAccount acc : accounts) {
            if (acc.getId() == id) {
                return acc;
            }
        }
        return null;
    }
}

