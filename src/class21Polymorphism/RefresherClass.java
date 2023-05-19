package class21Polymorphism;

public class RefresherClass {
    public static void main(String[] args) {
        int [] arr={10,20,30};
        for(int array:arr){
            System.out.println(array);
        }
        String [] names={"Vlad","Nadia","Rida"};// string is a class and string the object of that class
        for(String nam:names){
           // System.out.println(nam);
            System.out.println(nam.length());
        }
      Dog dog1=new Dog("Lal","White","Persian");
        Dog[]dogs={dog1,new Dog("Papi","White","Chinese")};
        for(Dog dog:dogs){
            dog.printInfo();
        }
    }
}
