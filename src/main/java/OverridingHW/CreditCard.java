package OverridingHW;

public class CreditCard {
    //Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
    double balance;
    double interest;
    double calculateInterest(double balance,double interest){
       double totalInterest=balance*(interest/100) ;
       return totalInterest;
    }
}
class Visa extends CreditCard{

}
class AX extends CreditCard{
    @Override
   public double calculateInterest(double balance,double interest){
        double totalInterest=balance*(interest/100);
        System.out.println(" Your current interest is ");
        return totalInterest;
    }
}