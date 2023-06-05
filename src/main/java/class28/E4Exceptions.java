package class28;

public class E4Exceptions {
    public static void main(String[] args) {
        //ALL THE ERRORS ARE CLASSES IN JAVA

        // the exception error we trying to do something that java don t understand
        System.out.println("Line1");
        System.out.println("Line2");
        // int[]arr=new int[-5];
        System.out.println("Line3");
        // java craeted try catch block to make sue you will not get the runtime error
        try {
            String name = null;
            name.length();
            "name".charAt(5);
        } catch (Exception e) {// help us avoid abrubte  inside this brackets it should be the name of the class
            System.out.println("Plan b");
            //    }catch(NegativeArraySizeException e){
            System.out.println("plan c");
            // }catch (ArithmeticException e){
            System.out.println("Plan d");
            //  }cat
            System.out.println("Line4");
            // java encounter situation , java exsecute till encounter a situation it stops evrything  to stop further damage
            // when it get error it stops evrything
            // System.out.println(10/0);
        }
    }
}
