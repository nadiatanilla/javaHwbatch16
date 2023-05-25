package class24ArrayList;

import java.util.ArrayList;

public class E3ArrauList {
    public static void main(String[] args) {


        ArrayList<Character> characters = new ArrayList<>();
        characters.add('D');
        characters.add('E');
        characters.add('W');
        System.out.println(characters);
        System.out.println(characters.indexOf('E'));

        System.out.println(characters.contains('W'));

        System.out.println(characters.isEmpty());

        characters.set(1,'H');
        System.out.println(characters);
    }
}