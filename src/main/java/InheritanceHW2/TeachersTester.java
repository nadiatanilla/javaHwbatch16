package InheritanceHW2;

import InheritanceHW.Teacher;

public class TeachersTester {
    public static void main(String[] args) {
        Teachers teacher1=new Teachers();
        teacher1.name="Rida";
        teacher1.subject="Math";
        teacher1.age=35;
        teacher1.isPresent=true;
        teacher1.attend();
        teacher1.explain();
        teacher1.teach();
        teacher1.speak();
        Teachers teacher2=new Teachers();
        teacher2.name="Fatima";
        teacher2.subject="chemistry";
        teacher2.age=25;
        teacher2.isPresent=true;
        teacher2.attend();
        teacher2.explain();
        teacher2.teach();
        teacher2.speak();
        Teachers teacher3=new Teachers();
        teacher3.name="Anna";
        teacher3.subject="Piano";
        teacher3.age=28;
        teacher3.isPresent=true;
        teacher3.attend();
        teacher3.explain();
        teacher3.teach();
        teacher3.speak();


    }
}
