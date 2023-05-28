package CollectionsHW;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {
    //Create a Set that will hold Objects of Student Type.
// In this set we do not care about the insertion order.
// Each student object should have name and studentID.
// Display name of each student.
   private String name;
   private String StudentId;

    public Student(String name, String studentId) {
        this.name = name;
        StudentId = studentId;
    }
    String getName(){
        return name;
    }
    String getStudentId(){
        return StudentId;
    }
}
class StudentTester{
    public static void main(String[] args) {
        Set<Student> students=new HashSet<>();
        students.add(new Student("Alex","125AZ"));
        students.add(new Student("Jhon","125QAS"));
        students.add(new Student("Alex","125AZ"));
        students.add(new Student("Anna","8@Qa"));
      //  System.out.println(students);
        for(Student s:students){
            System.out.println(s.getName());
            System.out.println(s.getStudentId());
        }

    }
}