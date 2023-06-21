package ReviewClass12;

import java.util.HashMap;
import java.util.Map;

public class Dog {
    String name;
    int age;
    Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    void printInfo(){
        System.out.println(name+" "+age);
    }

}
class TestDog{
    public static void main(String[] args) {
        Dog dog1=new Dog("Jodi",10);
        Dog dog2=new Dog("Jimi",15);
        Dog dog3=new Dog("Lucy",20);
        Map<String,Dog> dogMap=new HashMap<>();
        dogMap.put("Jody",dog1);
        dogMap.put("Jimi",dog2);
        dogMap.put("Lucy",dog3);
        dogMap.forEach((k,v)->v.printInfo());
    }
}
