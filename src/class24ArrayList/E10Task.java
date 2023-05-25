package class24ArrayList;

import java.util.ArrayList;

public class E10Task {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Juice");
        words.add("Orange");
        words.add("Strawberry");
        words.add("Soda");
        words.replaceAll(x->x.contains("a")||x.contains("e")?"Water":x);//? used to answer if the condition is true or not

       // words.replaceAll(x->"water");
        System.out.println(words);
        for (int i=0;i<words.size();i++){
            String word =words.get(i);
            if(word.contains("e")||words.contains("a")){
                words.set(i,"water");
            }
        }
        System.out.println(words);
     //   for(String w:words){
//if(w.contains("a")||w.contains("e")){
   // w.set(w,"Water");
  //  System.out.println(wo);
//}
      //  }
     //  System.out.println(words);
    }
}
