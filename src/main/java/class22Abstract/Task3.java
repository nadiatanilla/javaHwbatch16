package class22Abstract;

public interface Task3 {
    double getCount(double []arr);
}
class TaskTester implements Task3{

    @Override
    public double getCount(double[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i){
                count++;
            }
        }
        return count;
    }
}