package class21Polymorphism;

public class Refresher1 {
    public static void main(String[] args) {

// creating array of objects and printing them
        Dog dog1 = new Dog("Lal", "White", "Persian");
        Dog[] dogs = {dog1, new Dog("Papi", "White", "Chinese")};// array of objectects of Dog
        Dog d = dogs[0];
        d.printInfo();
        for (int i = 0; i < dogs.length; i++) {// using loop to print all the elements in Dog objects
            dogs[i].printInfo();
            // or enhanced for loop
              for (Dog dog : dogs) {
                 dog.printInfo();
              }
        }
    }}