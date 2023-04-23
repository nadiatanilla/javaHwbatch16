package class12classes;

public class E2StringDemo {
    public static void main(String[] args) {
        String userName="admin";
        String Password="password1234";

        if(userName.length()>8 && Password.length()>8){
            System.out.println("Username and password should be less than 8 characters");

        }else{
            System.out.println("Sign up successful");
        }
    }
}
