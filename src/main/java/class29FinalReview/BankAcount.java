package class29FinalReview;

public class BankAcount {
    double balance;
  public  BankAcount(double balance){
        this.balance=balance;

    }
   public void withdraw(double amountToWithdraw){
        if(amountToWithdraw>balance){
         //   System.out.println("Not possible insufficient balance ");
            throw new InsufficientBalance("not possible insufficient balance");
        }
        balance=balance-amountToWithdraw;
    }
}
