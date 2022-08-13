public class Checking extends Account {
    private int accountNumber;
    private static int nextaccountNumber = 100001;
    private double accountBalance;

    //Constructor
    Checking(double accountBalance) {
        this.accountBalance = accountBalance;
        this.accountNumber = nextaccountNumber;
        nextaccountNumber++;
    }


    //Methods
    public void withdraw(double amount) {
        this.accountBalance -= amount;
        if (this.accountBalance < 0) {
            this.accountBalance -= 20;
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
        }
    }


}
