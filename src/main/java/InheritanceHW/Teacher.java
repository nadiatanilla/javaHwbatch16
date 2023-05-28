package InheritanceHW;

public class Teacher {
    //Write a Java program called Teacher.
    // Identify features and 4 behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes
    String name;
     String subject;
    int age;
    boolean isPresent;
    void teach(){
        System.out.println(name+" teaches "+subject);
    }
    void explain(){
        System.out.println(name+" explains the course of "+subject);
    }
    void attend(){
        System.out.println("Is "+name+" present in the class "+isPresent);
    }
    void speak(){
        System.out.println("The age of teacher "+ name+" is "+age);
    }

}
class MathTeacher extends Teacher{

}
class ChemistryTeacher extends Teacher{

}
class PianoTeacher extends Teacher{

}

