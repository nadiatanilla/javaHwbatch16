package class8;

public class WhileLoopsOdd {
    public static void main(String[] args) {
        int account = 100;
        while (account >= 1) {
            if (account % 2 != 0) {
                System.out.println(account);
            }account--;
        }
    }
}