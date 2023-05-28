package class24ArrayList;

import java.util.ArrayList;

public class E11Task {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
        System.out.println(numbers);
        numbers.removeIf(x -> x % 5 == 0);
        System.out.println(numbers);

    }
}
