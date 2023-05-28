package class17Constructor;

public class Food {
    String name="Pasta";
    void printInfo(){
        String name="Burger";
        System.out.println(name);
        System.out.println(this.name);// refers to the instance variable
    }

    public static void main(String[] args) {
        Food obj=new Food();
        obj.printInfo();
    }
}
