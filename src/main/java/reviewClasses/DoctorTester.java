package reviewClasses;

public class DoctorTester {
    public static void main(String[] args) {
     Doctor doc   =new Doctor("John","Doe");// to debug we start herw the step in
     Doctor doc1=   new Doctor("Jane","Smith","Genycologist");
     doc.printInfo();
     doc1.printInfo();
    }
}
