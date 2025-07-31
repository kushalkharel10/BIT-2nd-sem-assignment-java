public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank("Nepal Rastra Bank");
        bank.displayBankInfo();

        Account acc1 = new Account("123456789", 500000.0);
        Customer cust = new Customer("Prabin Nepal", 20, acc1);
        cust.displayCustomerDetails();

        acc1.deposit(1000.0);
        acc1.withdraw(1500);

        System.out.println("\n After Transaction:");
        cust.displayCustomerDetails();
    }
}
