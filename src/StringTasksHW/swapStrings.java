package StringTasksHW;

public class swapStrings {
    public static void main(String[] args) {
        String x="Java";
        String y="Language";
        System.out.println("The value of x and y before swapping ");
        System.out.println("The value of x is "+x);
        System.out.println("The value of y is "+y);

        x=x+y;
        y=x.substring(0,x.length()-y.length());
        x=x.substring(y.length());
        System.out.println("The value of x and y after swapping");
        System.out.println("The value of x is "+x);
        System.out.println("The value of y is "+y);
    }
}
