package class15Methods;

public class SyntaxEmployee {
    String emId;
    int salary;
   static String name="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee obj1 =new SyntaxEmployee();
        obj1.emId="ID1";
        obj1.salary=667766;
        SyntaxEmployee OBJ=new SyntaxEmployee();
        OBJ.emId="id2";
        OBJ.salary=45544;
        System.out.println("ID EMPLOYEE  is "+obj1.emId+ " THE SALARY IS  "+obj1.salary+" the COE IS "+ obj1.name);


    }


}
