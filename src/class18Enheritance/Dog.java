package class18Enheritance;

public class Dog {
    String name;
    String color;
    String breed;
    int age;
    double weight;

    Dog(String name, String color, String breed, int age, double weight) {
       /* this.name=name;
        this.color=color;
        this.breed=breed;
        this.age=age;*/
        this(name, color, breed, age);// calling the constructor from the same class which takes name color...parameters
        this.weight = weight;
    }

    Dog(String name, String color, String breed, int age) {//this(name,color,breed,age) instead of
        this.name = name;
        this.color = color;
        this.breed = breed;

        this.age = age;

    }

    Dog(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;

    }
}