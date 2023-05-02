package ReplitsTest;

public class repl109Methods {
    void newLine(String sen,int num){
        for(int i=0;i<num;i++){
            System.out.println(sen);
        }
    }

    public static void main(String[] args) {
        repl109Methods rep=new repl109Methods();
        rep.newLine("NewLIne is method",3);
    }
}
