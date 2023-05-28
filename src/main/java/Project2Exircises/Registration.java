package Project2Exircises;

public class Registration {
    //Create Registration Class in which you would have variables as
    //email, userName and password that have an access scope only
    //within its own class. After creating an object of the class user should
    //be able to call methods and in each method separately pass values
    //to set users email, username and password.
    //Requirements:
    //A. Valid email consider to be only yahoo
    //B. Valid userName and password cannot be empty and should be of
    //length larger than 6 characters. Also valid password cannot contain
    //userName.
        private String email;
        private String userNme;
        private String password;

        public void setEmail (String email) {
            if (email.equals("Yahoo")) {
                this.email = email;
                System.out.println(" Valid Email");
            } else {
                System.out.println("Invalid Email");
            }
        }
        public void setUserNme (String userNme) {
            if (!userNme.isEmpty() && userNme.length() > 6) {
                this.userNme = userNme;
                System.out.println("Valid userName");
            }else{
                System.out.println("User name should be at least 6 characters");
            }
        }
        public void setPassword (String password){
            if(!password.isEmpty()&&password.length()>6&&!password.contains(userNme)){
            this.password = password;
                System.out.println("Valid Password");
            }else{
                System.out.println("Password should be at least 6 characters and does not contain username");
        }
    }

    public static void main(String[] args) {
        Registration set=new Registration();
        set.setEmail("Yahoo");
        set.setUserNme("NadiaChak");
        set.setPassword("@12356780");
    }
}