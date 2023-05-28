package Project2Exircises;

import OverloadingMethodHW.StaticOverloading;

abstract class Marks {
    //We have to calculate the average of marks obtained in three subjects
    //by student A and by student B. Create class 'Marks' with an abstract
    //method 'getPercentage' that will be returning the average percentage
    //of marks. Provide implementation of abstract method in classes 'A'
    //and 'B'. The constructor of student A takes the marks in three
    //subjects as its parameters and the marks in four subjects as its
    //parameters for student B.
    abstract double getPercentage();
}
class A extends Marks{
    int math;
    int geography;
    int history;
    A(int math,int geography,int history){
        this.math=math;
        this.geography=geography;
        this. history=history;
    }

    @Override
    double getPercentage() {
        return (math+geography+history)/3;
    }
}
class B extends Marks{
    double science;
    double math;
    double history;
    double english;
    B(double science,double math,double history,double english){
        this.science=science;
        this.math=math;
        this.history=history;
        this.english=english;

    }

    @Override
    double getPercentage() {
        return (science+math+history+english)/4;
    }
}
class Tester{
    public static void main(String[] args) {
        A a=new A(86,93,85);
        System.out.println(" Student A percentage "+a.getPercentage());
        B b=new B(78,80,91,82);
        System.out.println("Student B percentage "+b.getPercentage());
    }
}
