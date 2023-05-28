package class23ArrayList;

import java.util.ArrayList;
import java.util.List;

public class E5Arraylist {
    public static void main(String[] args) {
        HeadSet headsets1=new HeadSet("String1",79.99,3456);
        HeadSet headsets2=new HeadSet("String2",79.99,3456);
        HeadSet headsets3=new HeadSet("String3",79.99,3456);
       // headsets1.toString(); // define the adress
      //  headsets1.hashCode();

        List<HeadSet> headSets=new ArrayList<>();// we use Arraylist because it implement the interface List to achieve poly
        headSets.add(headsets1);
        headSets.add(headsets2);
        headSets.add(headsets3);
       // for(HeadSet h:headSets){
         //   h.print();
        //    System.out.println(headSets);
        //    System.out.println(headSets.toString());// to string method is in the object class(in which all classes inhereted from
       // }
        System.out.println(headSets);


        }
        public static void list(List<HeadSet>headSets){//  this is same way as above we just pass the list as parameters
        for(HeadSet h:headSets){
            h.print();
        }
        }
    }


class HeadSet extends Object{// ALL CLASSES INHERITED FROM OBJECT CLASS BY DEFAULT
  private  String title;
  private  double price;
  private  int  noOfReviews;

    public HeadSet(String title, double price, int noOfReviews) {
        this.title = title;
        this.price = price;
        this.noOfReviews = noOfReviews;
    }
    void print(){
     //   System.out.println(title+" "+price+" "+noOfReviews);
     //   System.out.println(toString());
    }

    @Override
    public String toString() {
        return "HeadSet{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", noOfReviews=" + noOfReviews +
                '}';
    }
    // @Override
   /* public String toString() {// return java
        return title+=" "+price+" "+noOfReviews; // this will help ass get all the objects in arraylist*/
    }

