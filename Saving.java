public class Saving extends Account {
    private int accountNumber;
    private static int nextaccountNumber = 100001;
    private double accountBalance;
    private int depositNumber;
    private static int nextDepositNumber = 1;
    private double interest;

    //Constructor
    Saving(double accountBalance) {
        this.accountBalance = accountBalance;
        this.accountNumber = nextaccountNumber;
        nextaccountNumber++;
    }


    //Methods
    public void withdraw(double amount) {
        this.accountBalance -= amount;
        if (this.accountBalance < 500) {
            this.accountBalance -= 10;
            System.out.println("Charging a fee of $10 because you are below $500");
        }
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
        this.depositNumber = nextDepositNumber;
        nextDepositNumber++;
        System.out.println("This is deposit " + this.depositNumber + " to this account");
        if (this.depositNumber > 5) {
            System.out.println("Charging a fee of $10");
            withdraw(10);
        }
    }

    public void addInterest() {
        this.interest = (this.accountBalance * 1.5) / 100;
        System.out.println("Customer earned " + this.interest + " in interest");
        this.accountBalance += interest;
    }


}
