package class29Review2;

import class29FinalReview.BankAcount;

import java.util.ArrayList;
import java.util.List;

public class E7Methods {
    public static void main(String[] args) {
        E7Methods e =new E7Methods();
        BankAcount bank=new BankAcount(10);
        e.print(bank);



        //an call another method inside method but you can not create it
    }
    void print(BankAcount bank){
        bank.withdraw(20);
    }

}