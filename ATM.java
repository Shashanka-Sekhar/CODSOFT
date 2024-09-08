import java.util.*;
public class ATM {
    private bankAccount acc;
    public ATM(bankAccount acc) {
        this.acc = acc;
    }
    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the ATM...");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.println("Enter an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Your balance is: " + acc.getBalance());
                break;
                case 2:
                System.out.println("Enter the amount you want to withdraw: ");
                double withdrawAmt = sc.nextDouble();
                acc.withdraw(withdrawAmt);
                break;
                case 3:
                System.out.println("Enter the amount you want to deposit: "); 
                double depositAmt = sc.nextDouble();
                acc.deposit(depositAmt);
                break;
                case 4:
                System.out.println("Thank you for using the ATM. Good bye!");
                sc.close();
                return;
                default:
                System.out.println("Invalid option. Please try again.");
            } 
        }
    }
}