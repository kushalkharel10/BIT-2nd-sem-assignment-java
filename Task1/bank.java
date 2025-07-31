public class Bank {
    private String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }
    public void displayBankInfo(){
        System.out.println("Welcome to " + bankName + "bank!");
    }
}
