package homeWorkVariable;

public class Students {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students
    String name;
    String Id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students obj=new Students();
        obj.name="Tanilla";
        obj.Id="id@123";
        numberOfStudents++;

        Students obj1=new Students();
        obj.name="Fatima";
        obj.Id="ID000@";
        numberOfStudents++;

        Students obj2=new Students();
        obj2.name="Rida";
        obj2.Id="Id1111@";
        numberOfStudents++;
        System.out.println(" The number of students is " +numberOfStudents);

    }
}
