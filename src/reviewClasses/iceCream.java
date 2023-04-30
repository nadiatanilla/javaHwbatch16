package reviewClasses;

public class iceCream {
    String flavor;
    boolean dairyFree;
    int price;
    // methods syntax  ===returneType returns nothing
    //method is block of code  actions behaviors that we want to reuse
    void eat(){
        System.out.println("We can eat "+flavor + " ice cream");

    }
    void buy(){
        System.out.println(flavor+ " ice cream cost "+price);
    }

}
