package OverloadingMethodHW;

public class AreaTester {
    public static void main(String[] args) {
        Area areaObj=new Area();
        System.out.println( "The rectangle area is : "+areaObj.multiply(5,2));
        System.out.println("The square are is : "+ areaObj.multiply(6));
    }
}
