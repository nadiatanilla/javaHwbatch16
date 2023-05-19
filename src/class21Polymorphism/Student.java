package class21Polymorphism;

public class Student {
  void speak(){
      System.out.println("Students speak");
  }
  void learn(){
      System.out.println("Students learn ");
  }
  void understand(){
      System.out.println("Students understand courses");
  }
}
class SyntaxStudent extends Student{
    @Override
    void speak(){
        System.out.println("Student learn Syntax");
    }
   void practice(){
       System.out.println("Student practice Java");
   }
}
class CollegeStudent extends Student{
    @Override
  void speak(){
      System.out.println("Student speak");
  }
  void revise(){
      System.out.println("Student revise courses");
  }
}
class SchoolStudent extends Student{
    @Override
    void speak (){
        System.out.println("Student speaks");
    }
    void graduate(){
        System.out.println("Student graduates ");
    }
}