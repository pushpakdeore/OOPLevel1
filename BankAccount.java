package pushpak15L1ClassObjectConstructor;

public class BankAccount {
    double balance;
    int accountNumber;
    BankAccount(double balance,int accountNumber){
        this.balance = balance;
        this.accountNumber =accountNumber;
    }
    public void depositMoney(int amount){
        balance =balance+amount;
        System.out.println("Deposited Amount is = "+amount+" Total Balnce is ="+balance);
    }
    public void WithdrawMoney(int amount){
        balance=balance-amount;
        System.out.println("withdraw Amount is = "+amount+" total Balance is ="+balance);
    }

    public static void main(String[] args) {
        BankAccount p =new BankAccount(344,1);
        p.depositMoney(100);
        p.WithdrawMoney(100);

    }
}
