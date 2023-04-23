package class12classes;

public class E11StringDemo {
    public static void main(String[] args) {
        String name="LEANDROR";
       // System.out.println(name.charAt(1));
        int sum=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='R'){
                sum++;
            }

        }
        System.out.println(sum);
    }
}
