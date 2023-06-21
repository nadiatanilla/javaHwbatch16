package PracticeJava;

public class largest {
    public static void main(String[] args) {
        int [] nums={1,5,6,8,9,56,89};
        int largest=nums[0];
        int smallest=nums[0];

        for(int i=0;i< nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }else if(nums[i]<smallest){
                smallest=nums[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
