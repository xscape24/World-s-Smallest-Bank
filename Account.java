public class Account {
    private int accountNumber;
    private static int nextaccountNumber = 100001;
    private double accountBalance;


    //Constructor
    Account() {
        this.accountBalance = 0;
        this.accountNumber = nextaccountNumber;
        nextaccountNumber++;
    }

    Account(double accountBalance) {
        this.accountBalance = accountBalance;
        this.accountNumber = nextaccountNumber;
        nextaccountNumber++;
    }

    //Methods
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void withdraw(double amount) {
        this.accountBalance -= amount;
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void addInterest() {

    }
}