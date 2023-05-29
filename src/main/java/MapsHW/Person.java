package MapsHW;

public class Person {
    //Create a Person class with following private fields: name, lastName, age, salary.
    //Variables should be initialized through constructor.
    //Inside the class also create a method to print user details.
    private String name;
    private String LastName;
    private int age;
    private double salary;



    Person(String name, String lastName, int age, double salary) {
        this.name = name;
        LastName = lastName;
        this.age = age;
        this.salary = salary;
    }
   public void printDetails(){
       System.out.println("*) First Name : "+name+" Last name : "+LastName+" Age is : "+age+" The salary is "+salary);
   }

}
