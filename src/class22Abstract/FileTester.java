package class22Abstract;

public class FileTester {
    public static void main(String[] args) {
        File[] files={new JavaFile("Java",456),new WordFile("Word",344),new PDFfile("PDF",453),};
        for(File f:files){
            f.printInfo();
            f.open();
            f.close();
            f.edit();
        }
    }
}
