package reviewClasses;

public class AbstractTest {
    public static final String str="hello";// constant that is not changeable;
    public static void main(String[] args) {
        // WE CANNOT CREAT AN OBJECT OF ABSTRACT CLASSSSSSSSSS
       triangle tr= new triangle("triangle","purple",12,18);
       tr.print();
        System.out.println( tr.calculate());
        tr.printInfo();

        Rectangle rec=new Rectangle("rectangle","black",120,180);

        Abstract ab= new triangle("triangle","blavck",10,13);
        ab.printInfo();
        System.out.println( ab.calculate());

        Abstract[] abstr={new triangle("triangle","purple",12,18),
                new Rectangle("rectangle1","black",120,180),
                new Rectangle("rectangle","blue",10,20) };
        for(Abstract abs:abstr){
            abs.printInfo();
            double area =abs.calculate();
            System.out.println("The area of "+abs.type+" = "+area);
        }
    }
}
