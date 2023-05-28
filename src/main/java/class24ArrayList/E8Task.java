package class24ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class E8Task {
    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList();
        words.add("Apple");
        words.add("House");
        words.add("Mouse");
        words.add("Car");
        words.removeIf(word->word.endsWith("e"));
        words.removeIf(x->x.endsWith("e")); // this way is more breif
       // words.removeIf((String word)->word.endsWith("e")); behind the scene how it is
        System.out.println(words);
       // words.remove(0);
       // words.remove(1);
       // words.remove(2);

      /* for(String wor:words){
           if(wor.endsWith("e")){
               words.remove(wor);// enhanced loop always fail in term of adding or removing
           }
       }*/
      /*  for(int i =0;i<words.size();i++){
            String word=words.get(i);
            if(word.endsWith("e")){
                words.remove(i);// because array are dynamic
                i--;
            }
        }
        System.out.println(words);// when adding or removing something can not use enhanced loop or for loop*/

        // that is why we use ITERATOR  IS an interface
      /*  Iterator<String> iterator=words.iterator();
        while(iterator.hasNext()){
            String word=iterator.next();// acctual value
            if(word.endsWith("e")){
                iterator.remove();// to remove
            }
        }*/
        //BUT WE HAVE TO USE THIS SHORT STRUCTURE FOR ITERATOR
      words.removeIf(word->word.endsWith("e"));
        System.out.println(words);
    }
}
