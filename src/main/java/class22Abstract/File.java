package class22Abstract;

public abstract class File {
    //Create a class File that will have the following behaviors: open, edit, close.
    // Edit and close are implemented method while open is an abstract.
    // Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    // Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc.
   private String name;
   private int memory;

    public File(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }
    void printInfo(){
        System.out.println(name+" the memory is "+memory);
    }

    abstract void open();
     void edit(){
         System.out.println("Editing the project");
     }
    void close(){
        System.out.println("Closing the project");
    }
}
class JavaFile extends File{
    public JavaFile(String name, int memory) {
        super(name, memory);
    }

    @Override
    void open(){
        System.out.println(" to open java file we need notepad");
    }
}
class WordFile extends File{
    public WordFile(String name, int memory) {
        super(name, memory);
    }

    @Override
    void open(){
        System.out.println(" to Open WordFile we need microsoft");
    }
}
class PDFfile extends File{
    public PDFfile(String name, int memory) {
        super(name, memory);
    }

    @Override
    void open(){
        System.out.println("Open PDF file");
    }
}