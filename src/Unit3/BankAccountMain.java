package JavaSampleProject1.src.Unit3;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(13500, "Canada", 150000);
        
        b1.displayCurrentBalance();
        b1.withdraw(2000);
        b1.displayCurrentBalance();
        b1.deposit(-2000);
        b1.displayCurrentBalance();
        b1.deposit(89000);
        b1.displayCurrentBalance();
        
    }
    
}
