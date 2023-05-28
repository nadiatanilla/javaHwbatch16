package class13String;

public class Printer {
    void printSomething(){
        System.out.println("Hello java");
        System.out.println("Hello java");
        System.out.println("Hello java");
    }
    void printWord(String word){
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
    }
    void printWordManyTimes(String word,int number){
        for(int i=0;i<number;i++){
            System.out.println(word);
        }
    }

}
