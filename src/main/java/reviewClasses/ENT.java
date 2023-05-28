package reviewClasses;

public class ENT extends Doctor {
    String location;
    ENT(String firstName,String lastName,String speciality,String location){
      super(firstName,lastName,speciality);
      this.location=location;
    }
    public void treat(String patient){
        System.out.println(" this is new "+patient);
    }
    void recover(){
        System.out.println(firstName+" "+lastName+" is a good doctor");
    }

    public static void main(String[] args) {
        ENT ent=new ENT("Jhon","Smith","ENT","vIRGINIA");
        ent.treat();
        ent.printInfo();
        ent.treat("KJLMR");
        ent.recover();
        Doctor ent1=new ENT("A","B","C","D");
        ent1.printInfo();
       // ent1.recover();
        ent1.treat();
        ent1.treat("Fatima");
    }
}
