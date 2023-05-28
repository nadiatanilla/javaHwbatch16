package E14TasksMethods;

public class task3 {
    //Write a method to return whether given number is prime or not?
    boolean prime(int num) {
        boolean isPrime = false;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            isPrime = true;
        }

        return isPrime;
    }

    public static void main(String[] args) {
        task3 obj=new task3();
        int num=8;
       boolean result= obj.prime(num);
        System.out.println(result);
    }

}