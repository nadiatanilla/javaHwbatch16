package projectTasks;

public class largestTemp {
    public static void main(String[] args) {
             /*1). Create a program that uses an array to store a list of
             temperatures for a week, and then uses a loop to find
               the highest and lowest temperature for the week.  */
        int[] temp={23,45,67,-3,35};
        int largest=temp[0];
        int smallest =temp[0];
        for(int x=1;x<temp.length;x++){
            if(temp[x]>largest){
                largest=temp[x];
            }
            else if(temp[x]<smallest){
                smallest=temp[x];
            }
        }
        System.out.println("The largest temperature degree is "+largest);
        System.out.println("The smallest temperature degree is "+ smallest);

    }
}
