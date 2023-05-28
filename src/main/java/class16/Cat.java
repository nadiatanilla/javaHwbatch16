package class16;

public class Cat {
    private String name="Nadia";
    private String breed;
    private String color;
    public void printInfo(String password){// this is how we can access a private info
        if(password.equals("12345")){
        System.out.println(name);
        }else{
            System.out.println(" not valid");

        }
    }
}
