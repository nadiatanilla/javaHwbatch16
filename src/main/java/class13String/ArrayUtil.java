package class13String;

public class ArrayUtil {
    public static void main(String[] args) {
        int []arr={10,20,45,89};
        int []arr1={10,26,455,889};
        int number=100;
        int number1=10;
        int number2=20;
      //  for(int i=0;i<arr.length;++i){

        ArrayUtil ivan=new ArrayUtil();
        ivan.searchArray(arr,number);
        ivan.searchArray(arr1,number1);
        ivan.searchArray(arr,number2);
        }
        void searchArray(int[]arr,int number){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number){
                System.out.println("yes");
                break;
            }
        }
        }
    }

