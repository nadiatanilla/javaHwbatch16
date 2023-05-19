package class22Abstract;

public interface ArrayUtil {
    public boolean searchArr(int[]array,int number);
}
class Main implements ArrayUtil{

    @Override
    public boolean searchArr(int[] array, int number) {
        boolean isNum=true;
        for(int i=0;i<array.length;i++){//for(int n:array){if(n==number)}
            if(array[i]==number){
              return isNum;
            }
        }
      return false;  //return isNum;
    }

}