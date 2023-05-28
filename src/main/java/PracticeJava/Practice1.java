package PracticeJava;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 20; i > 0; i--) {
            if (i % 2 == 1) {
                numbers.add(i);
                // System.out.println(numbers);

            }
           // System.out.println(numbers);
        }
        System.out.println(numbers);

        numbers.removeIf(x->x%3==0);
        System.out.println(numbers);


    }
}
