package OverloadingMethodHW;

public class PrivateOverloading {
    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    private double purchase(int item1,int item2){
        int total=item1+item2;
        return total;
    }
    private double purchase(int item3,int item4,double item5){
        double total=item3+item4+item5;
        return total;
    }
    private double purchase(double item6,int item7){
        double total=item6+item7;
        return total;
    }

    public static void main(String[] args) {
        PrivateOverloading obj=new PrivateOverloading();
        System.out.println("This week purchase is "+obj.purchase(100,230));
        System.out.println("This month purchase is "+obj.purchase(160,230,99.99));
        System.out.println("This year purchase is "+obj.purchase(666.99,1000));
    }
}
