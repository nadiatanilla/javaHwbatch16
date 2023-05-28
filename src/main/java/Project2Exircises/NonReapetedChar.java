package Project2Exircises;

public class NonReapetedChar {
    public static void main(String[] args) {
        String str="karakas";
        for(int i=0;i<str.length();i++){
            boolean nonReap=true;
            for(int j=0;j<str.length();j++){
                if( i!=j&&str.charAt(i)==str.charAt(j)){
                    nonReap=false;
                }
            }
            if(nonReap){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
