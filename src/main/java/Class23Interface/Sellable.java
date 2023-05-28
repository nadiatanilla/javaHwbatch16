package Class23Interface;

public interface Sellable {
    int price=12000;// all the fields are public static final noooo private
    // nnoo protected
    // always public static final
  // static void sell(); no we can not override static
   // private void sell(); no private because no one will be able to provid implement
    //protected void sell();not allowed
    // we can not have body no implemented in interface
   static void sell(){
       System.out.println("Allowed");
   }

}
class Tester1{
    public static void main(String[] args)
    {
        Sellable.sell();
    }
}