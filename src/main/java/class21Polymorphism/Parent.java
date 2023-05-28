package class21Polymorphism;

public class Parent {// final keyword with class no inheritance
    final int numOfMonthsInYear=12;// the value will never change it
  final  void getMarry(){//  with final  keyword we can not override this method
        System.out.println("Marry Shakira");
    }
    void study(){
        System.out.println("Study medicine");
    }
}
class Axel extends Parent{
    @Override
    void study(){
        System.out.println(numOfMonthsInYear);
        System.out.println("No i want SDET");
    }
   }
