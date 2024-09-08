public class bankAccount {
    private double bal;
    public bankAccount(double initialBal) {
        this.bal = initialBal;
    }
    public double getBalance() {
        return bal;
    }
    public void deposit(double amt) {
        if(amt > 0) {
            bal += amt;
            System.out.println("Successfully deposited " + amt + " rupees");
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amt) {
        if(amt > 0 && amt <= bal) {
            bal -= amt;
            System.out.println("Successfully withsrew " + amt + " rupees.");
        }
        else if(amt > bal) {
            System.out.println("Insufficient balance.");
        }
        else {
            System.out.println("Invalid withdrawal amount");
        }
    }
}