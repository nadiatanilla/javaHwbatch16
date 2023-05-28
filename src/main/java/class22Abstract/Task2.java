package class22Abstract;

public interface Task2 {
double getAvg(double[] arr);
}
class M implements Task2{

    @Override
    public double getAvg(double[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+i;
        }

        return 0;
    }
}