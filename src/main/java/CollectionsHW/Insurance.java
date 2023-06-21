package CollectionsHW;

public abstract class  Insurance {
    //Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
    // Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
    // Create 3 objects of the sub classes and store them in ArrayList.
    // Using for loop/advanced for loop/ iterator access all methods of the class.
    // Create a Card class that will have interest rate field and card type
    //  and a constructor that will initialize the fields.
    //  Create 3 objects of different card and store them into LinkedList.
    //  Using for loop/advanced for loop/ iterator access all methods of the class.
   String insuranceName;

    public Insurance(String insuranceName)
    {
        this.insuranceName = insuranceName;
    }

   abstract void getQuote();
  abstract void cancelInsurance();
}
class Car extends Insurance{
 private String carModel;
    public Car(String insuranceName,String carModel) {
        super(insuranceName);
        this.carModel=carModel;

    }

    @Override
    void getQuote() {
        System.out.println("The insurance "+insuranceName+" for the car model "+carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancel the insurance "+insuranceName+" "+carModel);
    }

    @Override
    public String toString() {
        return insuranceName+" "+carModel;
    }
}
class Pet extends Insurance{
String petType;
    public Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;

    }

    @Override
    void getQuote() {
        System.out.println("The Pet insurance is "+insuranceName+" "+petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println(" Cancelling "+insuranceName+" "+petType);
    }
}
class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println(" The Health insurance "+insuranceName);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancelling "+insuranceName);
    }

    @Override
    public String toString() {
        return insuranceName;
    }
}
