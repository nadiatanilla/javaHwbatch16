package projectTasks;

public class primeNumber {
    public static void main(String[] args) {
        int[] number = {2, 6, 8, 9, 7,19,23};
        for (int num:number) {
            int count=0;
            for (int j=1;j<num;j++) {
                if (num % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println( num);

            }
        }
    }
     /*   for (int num : numbers) {
            int count = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                       break;
                }
            }
            if (count == 0) {
                System.out.println(num);
            }*/
      /*  int num = 7;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
            if (count == 2) {
                System.out.println(" prime number");
            }
            else {
                System.out.println("not a prime number");
            }*/
       /*     int num1=6;
            boolean isPrime=true;
            if(num>1) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
                else{
                    isPrime=false;

                }if(isPrime){
            System.out.println(num+" is a prime number");
        }else{
            System.out.println(num+ "is not a prime num");
        }*/
        }




