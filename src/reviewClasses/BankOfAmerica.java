package reviewClasses;

public class BankOfAmerica {
    public static void main(String[] args) {
        BankAccount obj=new BankAccount();
        obj.accountHolder="Nadia";
        obj.accBalance=234;
        obj.accountNumber=5667774774L;
        obj.ssn=67555;
        System.out.println(BankAccount.BnkName); // STATIC VARIABLE SHOULD BE ACCESS BY THE NAME OF THE CLASS
        BankAccount obj1=new BankAccount();
        obj1.accountHolder="Nadia";
        obj1.accBalance=2334;
        obj1.accountNumber=56677574774L;
        obj1.ssn=6755500;
        System.out.println(BankAccount.BnkName);

    }
}
