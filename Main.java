import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n===== 🏦 Simple Bank System =====");
            System.out.println("1️⃣ Create Account");
            System.out.println("2️⃣ Deposit Money");
            System.out.println("3️⃣ Withdraw Money");
            System.out.println("4️⃣ Check Balance");
            System.out.println("5️⃣ Exit");
            System.out.print("👉 Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNum = sc.next();
                    System.out.print("Enter Holder Name: ");
                    String name = sc.next();
                    System.out.print("Enter Initial Deposit: ");
                    double balance = sc.nextDouble();
                    bank.addAccount(new Account(accNum, name, balance));
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accNum = sc.next();
                    Account acc = bank.findAccount(accNum);
                    if (acc != null) {
                        System.out.print("Enter Deposit Amount: ");
                        double amount = sc.nextDouble();
                        acc.deposit(amount);
                    } else {
                        System.out.println("❌ Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNum = sc.next();
                    acc = bank.findAccount(accNum);
                    if (acc != null) {
                        System.out.print("Enter Withdrawal Amount: ");
                        double amount = sc.nextDouble();
                        acc.withdraw(amount);
                    } else {
                        System.out.println("❌ Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accNum = sc.next();
                    acc = bank.findAccount(accNum);
                    if (acc != null) {
                        acc.checkBalance();
                    } else {
                        System.out.println("❌ Account not found!");
                    }
                    break;

                case 5:
                    System.out.println("👋 Thank you for using the Bank System!");
                    sc.close();
                    return;

                default:
                    System.out.println("⚠️ Invalid choice! Try again.");
            }
        }
    }
}
