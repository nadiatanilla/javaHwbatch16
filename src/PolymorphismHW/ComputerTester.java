package PolymorphismHW;

public class ComputerTester {
    public static void main(String[] args) {
   Computer [] computer={new Apple("Apple","XS2",34,89),new Dell("Dell","G3",45,78),
           new Lenovo("Lenovo","Pro 10",55,120),new HP("HP","GX12",87,120),};
        for(Computer com:computer){
            com.printInfo();
            com.searchApp();
            com.playGames();
            if(com instanceof Apple){
                ((Apple) com).installingApps();
            }
            if(com instanceof Lenovo ){
                ((Lenovo)com).studyOnLine();
            }
            if(com instanceof HP){
                ((HP)com).addFiles();
            }
            Computer c=new Dell("Dell","GA",89,99);
            ((Dell)c).download();
        }
    }
}
