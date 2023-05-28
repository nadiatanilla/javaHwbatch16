package InheritanceHW2;

import InheritanceHW.Teacher;

public class Teachers {
    //Write a Java program called Teacher.
    // Identify features and 4 behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes
    protected String name;
     protected String subject;
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
class MathTeacher extends Teachers {

}
class ChemistryTeacher extends Teachers{

}
class PianoTeacher extends Teachers{

}


