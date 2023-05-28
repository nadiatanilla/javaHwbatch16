package OverloadingMethodHW;

public class StaticOverloading {
    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    static void print(String a,String b){
        System.out.println(a+" "+b);
    }
    static void print(int x,String z){
        System.out.println(x+" "+z);
    }
    static void print(String y,int w){
        System.out.println(y+" "+w);
    }

    public static void main(String[] args) {
        print("A","Z");
        print(2,"X");
        print("Q",6);
    }
}


