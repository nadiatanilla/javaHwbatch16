package class8;

public class WhileLoopsEx4 {
    public static void main(String[] args) {
        int count = 25;
        while (count >=5) {
            if(count!=15&&count!=10) {
                System.out.print(count + " ");
            }
                count -= 5;

        }
    }
}