public class main {
    public static void main(String[] args) {
        bankAccount acc = new bankAccount(1500);
        ATM atm = new ATM(acc);
        atm.start();
    }
}