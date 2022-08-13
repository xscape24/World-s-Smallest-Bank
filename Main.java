import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Account checkings = new Checking(0);
        Account savings = new Saving(0);
        int userChoice;

        do {
            printMenu();
            userChoice = scan.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("How much would you like to withdraw from Checking?");
                    double amount = scan.nextDouble();
                    checkings.withdraw(amount);
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw from Saving?");
                    double amount2 = scan.nextDouble();
                    savings.withdraw(amount2);
                    break;
                case 3:
                    System.out.println("How much would you like to deposit into Checking?");
                    double amount3 = scan.nextDouble();
                    checkings.deposit(amount3);
                    break;
                case 4:
                    System.out.println("How much would you like to deposit into Saving?");
                    double amount4 = scan.nextDouble();
                    savings.deposit(amount4);
                    break;
                case 5:
                    System.out.println("Your balance for checking " + checkings.getAccountNumber() + " is " + checkings.getAccountBalance());
                    break;
                case 6:
                    System.out.println("Your balance for saving " + savings.getAccountNumber() + " is " + savings.getAccountBalance());
                    break;
                case 7:
                    savings.addInterest();
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Incorrect option, try again.");
            }
        } while (userChoice != 8);

    }


    //Methods
    public static void printMenu() {
        System.out.println("--Menu--");
        System.out.println("1. Withdraw from Checking");
        System.out.println("2. Withdraw from Savings");
        System.out.println("3. Deposit to Checking");
        System.out.println("4. Deposit to Savings");
        System.out.println("5. Balance of Checking");
        System.out.println("6. Balance of Savings");
        System.out.println("7. Award Interest to Savings now");
        System.out.println("8. Quit");
    }


}
