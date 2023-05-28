package class25ArrayList;

public class Student {
    String name;
    String id;
    int age;

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

 /*   @Override
    public String toString() {
        return name;// this will print the name only
    }*/

    @Override
    public String
    toString() {// this will help us to returmn Student{name=",id=',age} ====used to print the object too
        return "Student{" +
                "name='" + name + '\'' +// this backward slash use it because we can not have """ so we use /s
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
class StudentTester{
    public static void main(String[] args) {
        Student student=new Student("Nadia","ID12345",30);
        System.out.println(student);// if we print this without tosTRING will get only the adrss
    }
}

