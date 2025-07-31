
public class Customer {
    private String name;
    private int age;
    private Account account;
    Customer(){
        this.name = "unknown";
        this.age = 0;
        this.account = new Account();
    }
    Customer(String name, int age, Account account){
        this.name = name;
        this.age = age;
        this.account = account;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age -= age;
    }
    Account getAccount() {
        return account;
    }
    public void displayCustomerDetails(){
        System.out.println("Customer Name: "+name);
        System.out.println("age: "+age);
        account.displayAccountDetails();
    }
}
