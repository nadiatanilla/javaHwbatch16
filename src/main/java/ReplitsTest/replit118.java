package ReplitsTest;

public class replit118 {
    String spaceOut(String word){
        for(int i=0;i<word.length();i++){
            System.out.print(word.charAt(i)+" ");
        }return word;
    }

    public static void main(String[] args) {
        replit118 rep=new replit118();
        rep.spaceOut("hello");

        replit118 re=new replit118();
        re.spaceOut("technology");
    }
}
