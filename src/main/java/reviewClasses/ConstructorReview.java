package reviewClasses;

public class ConstructorReview {
    // h0w to create constructor
    //1
    ConstructorReview(){
        System.out.println(" 0argument");
    }
    ConstructorReview(String str){
        System.out.println(" I am "+str);
    }

    public static void main(String[] args) {
        new ConstructorReview();
        new ConstructorReview("Ndia");
    }
}
