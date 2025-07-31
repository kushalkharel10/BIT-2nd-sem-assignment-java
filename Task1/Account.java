public class Account {
    private String accountNumber;
    private double balance;

    // Default constructor
    Account() {
        this.accountNumber = "0000011112222";
        this.balance = 0.0;
    }

    // Parameterized constructor
    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method (renamed from setBalance)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid or insufficient amount for withdrawal.");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs. " + balance);
    }

    // Finalize method (will be called by garbage collector)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Account " + accountNumber + " is closed");
    }
}

// Test class with main method
class TestAccount {
    public static void main(String[] args) {
        // Creating account with default constructor
        Account acc1 = new Account();
        acc1.deposit(2000);
        acc1.withdraw(500);
        acc1.displayAccountDetails();

        System.out.println("---------------------------");

        // Creating account with parameterized constructor
        Account acc2 = new Account("1234567890123", 5000);
        acc2.deposit(1500);
        acc2.withdraw(3000);
        acc2.displayAccountDetails();
    }
}
