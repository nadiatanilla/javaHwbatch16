package class12classes;

public class DogTester {
    public static void main(String[] args) {
        Dog actualDog=new Dog();
        actualDog.name="Jacky";
        actualDog.age=15;
        actualDog.breed="German";
        actualDog.color="Black";
        actualDog.weight=50;
        actualDog.isFat=true;

        actualDog.bark();
    }

}
