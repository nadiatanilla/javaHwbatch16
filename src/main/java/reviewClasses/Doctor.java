package reviewClasses;

public class Doctor {
    String firstName,lastName;
    String speciality;
    int yearsOfExperience;
    double salary;
    static boolean degree;
    Doctor(String firstName,String lastName){// local var for the constructor
    this.firstName  =  firstName;
     this.lastName =  lastName  ;
    }
    Doctor(String firstName,String lastName,String speciality){// local var for the constructor
  //  this.firstName  =  firstName;
   //  this.lastName =  lastName  ;
        this(firstName,lastName);// if we already have valuated variable in previous constru

     this.speciality=speciality;

    }
   protected void printInfo(){
        System.out.println(" Doctor "+firstName+" "+lastName+" "+speciality);
    }
      protected void treat(){
    System.out.println("Doctors treat patience");
}
protected void treat(String patient){
    System.out.println(patient);
}
double getSalary(double num,int num2){
    double total=num+num2;
    return total;
}
}
