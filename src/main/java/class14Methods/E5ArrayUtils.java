package class14Methods;

public class E5ArrayUtils {
    boolean contains(int []arr,int number){
        boolean isFound=false;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==number){
                isFound=true;
            }
        }
        return isFound;// it is better to use one return
    }

  }

