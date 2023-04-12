package HomeWorkArrays;

public class JavaSentence {
    public static void main(String[] args) {
        String []words={"Java","Saturday","day","coding","is"};
        System.out.print(words[1]+" "+ words[4]+" "+words[0]+" "+ words[3]+" "+words[2] );

        System.out.println();

        String []sentence=new String[5];
        sentence[0]="Saturday";
        sentence[1]="is";
        sentence[2]="Java";
        sentence[3]="coding";
        sentence[4]="day";
        System.out.print(sentence[0]+" "+sentence[1]+" "+sentence[2]+" "+sentence[3]+" "+sentence[4]  );



    }
}
