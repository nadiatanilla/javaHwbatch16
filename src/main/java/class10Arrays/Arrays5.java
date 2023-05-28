package class10Arrays;

public class Arrays5 {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                System.out.print(numbers[i]+" ");
            }
        }
        System.out.println();
        char[] characters = {'H', 'B', 'C', 'D', 'E'};
        for (int j = 0; j<characters.length; j += 2){
            System.out.print(characters[j]+" ");
        }
    }
}