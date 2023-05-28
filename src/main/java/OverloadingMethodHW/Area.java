package OverloadingMethodHW;

public class Area {
    // Create 1 class in which create a methods that will calculate the area of Method name must be called calculateArea
    //Rectangle
    //Square
    public int multiply(int length,int width){
        int areaRectangle=length*width;
        return areaRectangle;
    }
    public int multiply(int side){
        int squareArea=side*side;
        return squareArea;
    }
}
