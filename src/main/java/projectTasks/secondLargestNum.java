package projectTasks;

public class secondLargestNum {
    public static void main(String[] args) {
        int[]num={6,9,10,45,67,66};
        int largest=num[0];
        int second=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                second=largest;
                largest=num[i];

            } else if (num[i]>second){
                second=num[i];
            }
            }
        System.out.println("the second largest number is "+ second);
        }
    }

