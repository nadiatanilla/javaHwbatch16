package ReplitsTest;

public class rep139 {

    public String alpphabetical(String str){
        char ch;
        for (int i=65;i<90;i++){
            for(int j=0;j<str.length();j++){

             ch=str.charAt(j);
if(ch==(char)i|| ch==(char)(i+32)){
str=str+ch;

}
                }
            }
return str;
    }

    public static void main(String[] args) {
        rep139 obj=new rep139();
       String res= obj.alpphabetical("computer");
        System.out.println(res);
    }
}
