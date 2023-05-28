package cass9;

public class NestedLoops10 {
    public static void main(String[] args) {
        for (int a = 0; a < 4; a++) {
            int x = 2;
            while (x <= 10) {

                System.out.print(x+" ");
                x+=2;

            }
            System.out.println();

        }
    }
}
