package PolymorphismHW;

public abstract class Computer {
//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.
    protected String name,model;
   protected double size;
   protected int memory;

    public Computer(String name, String model, double size, int memory) {
        this.name = name;
        this.model = model;
        this.size = size;
        this.memory = memory;
    }

    abstract void searchApp();
  abstract void playGames();
  final void watchVideos(){
    System.out.println("Watching videos on device");
}
public void printInfo(){
    System.out.println("The device is "+name+ " the model is "+model+" and the size is "+size+" it has memory "+memory);
}
}
class Apple extends Computer{
    Apple(String name,String model,double size,int memory){
        super(name,model,size,memory);
    }
    @Override
public void searchApp(){
    System.out.println("Searching on App store of ");
}
public void playGames(){
    System.out.println("Playing games on Apple ");
}
protected void installingApps(){
    System.out.println("Installing Apps on Apple ");
}
}
class Lenovo extends Computer{
    public Lenovo(String name, String model, double size, int memory) {
        super(name, model, size, memory);
    }
void playGames(){
    System.out.println("Playing games on Lenovo");
}
    @Override
void searchApp(){
    System.out.println("Searching om Lenovo");
}
void studyOnLine(){
    System.out.println("Students are studying online ");
}
}
class HP extends Computer{

    public HP(String name, String model, double size, int memory) {
        super(name, model, size, memory);
    }
    @Override
    void playGames(){
        System.out.println(name+" has a lot of games with a memory of "+memory);
    }
    @Override
    void searchApp(){
        System.out.println(name+" has a lot of Apps");
    }
    void addFiles(){
        System.out.println(" adding files in second");
    }
}
class Dell extends Computer{

    public Dell(String name, String model, double size, int memory) {
        super(name, model, size, memory);
    }

    @Override
    void playGames() {
        System.out.println(" Playing  games in "+name);
    }

    @Override
    void searchApp() {
        System.out.println("Searching for apps in "+name +" is easy");
    }
    void download(){
        System.out.println("Downloading all your projects in"+name);
    }
}