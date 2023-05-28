public class class6 {static int countA (String s){
    int count =0;
    String word="";
    for(int i=0;i<s.length();i++){
       s.charAt(i);
        if(s.equalsIgnoreCase("a")){
            count++;
        }
    }
    return count;
}

//test case below (dont change):
    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}
