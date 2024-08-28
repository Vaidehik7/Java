public class BankAccount {
    private String accountHolderName;
    private double balance;

    // Static variables
    private static double interestRate;
    private static int numberOfAccounts;

    // Constructor to initialize instance variables and increment numberOfAccounts
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        numberOfAccounts++;
    }

    // Instance method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Instance method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Static method to set the interest rate
    public static void setInterestRate(double rate) {
        if (rate > 0) {
            interestRate = rate;
            System.out.println("Interest rate set to: " + interestRate + "%");
        } else {
            System.out.println("Interest rate must be positive.");
        }
    }

    // Static method to calculate annual interest for a given balance
    public static double calculateAnnualInterest(double balance) {
        return balance * (interestRate / 100);
    }

    // Static method to get the number of accounts
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount.setInterestRate(5.0);

        BankAccount account1 = new BankAccount("Alice", 1000.0);
        BankAccount account2 = new BankAccount("Bob", 2000.0);

        System.out.println("Number of accounts: " + BankAccount.getNumberOfAccounts());

        account1.deposit(500);
        account2.withdraw(300);

        double interest1 = BankAccount.calculateAnnualInterest(account1.balance);
        double interest2 = BankAccount.calculateAnnualInterest(account2.balance);

        System.out.println("Annual interest for Alice's account: $" + interest1);
        System.out.println("Annual interest for Bob's account: $" + interest2);
    }
}
