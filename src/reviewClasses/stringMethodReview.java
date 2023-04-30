package reviewClasses;

public class stringMethodReview {
    public static void main(String[] args) {
        String str=new String("hello");
        System.out.println(str);
        String str1="Hello";
        System.out.println(str1);
        // mutable means the string will not change look bellow

        // parameters
        String day="Saturday";
        int index=day.indexOf("day");// parameter is what inside()
        System.out.println(index);
        String food="I like Indian food";
       String[]arr =food.split(" ");
       // we need loop
        for(String a:arr){
            System.out.println(a);
        }
    }
}
