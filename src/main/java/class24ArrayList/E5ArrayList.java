package class24ArrayList;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {
        int num=10;
        int number=20;
        ArrayList<Integer> numbers=new ArrayList<>();
        // data type is being converted auto from int to Integer (AUTO BOXING
        numbers.add(num);
        numbers.add(number);
        // datat type is being converted automativally from Integer to int (auto unboxing)
    }
}
