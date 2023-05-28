package OverridingHW;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard credit=new CreditCard();
        System.out.println( credit.calculateInterest(268.9,5.2));

        Visa visa=new Visa();
        System.out.println(visa.calculateInterest(356.6,3.2));

        AX ax=new AX();
        System.out.println(ax.calculateInterest(435.7,2.4));
    }
}
