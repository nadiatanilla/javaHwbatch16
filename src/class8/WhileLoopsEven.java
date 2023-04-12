package class8;

public class WhileLoopsEven {
    public static void main(String[] args) {
        int count = 20;
        while (count <= 100) {
            if (count % 2 !=1) {//numbers that equals that are not included /or %2==0//==>
                System.out.println(count);
            }
            count++;
        }

    }
}
