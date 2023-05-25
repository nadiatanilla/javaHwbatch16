package class23_2Incapsulation;

public class BankAcount {
    String firstName;
    private String userName;
    private String password;
    private double accountBalance=120;
// create private to restrict the access
    public BankAcount(String userName, String password) {
        this.userName = userName;// no setter method
        this.password = password;
    }
    String getFirstName(){
        return firstName;
    }
    public double getAccountBalance(String password) {// gator methods to get the access the private
        if (password.equals(this.password)) {
            return accountBalance;
        }else{
            return 0;
        }
    }
    public void setAccountBalance(double balance){// setter methods to change the  value of private method
        accountBalance=balance;
    }
}
class BankTester{
    public static void main(String[] args) {
      BankAcount bank=new BankAcount("User123","A21234") ;
        System.out.println(bank.getAccountBalance("A21234"));
        bank.setAccountBalance(100000);
        bank.getFirstName();

    }
}