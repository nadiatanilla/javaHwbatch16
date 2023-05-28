package cass9;

public class WhileLoopBreak6 {
    public static void main(String[] args) {
        for(int x=0;x<3;x++){//  this one tell us how many time it should repeat
            for(int z=0;z<5;z++){// themaximum that want print <5
                System.out.print(z+" ");
            }
            System.out.println();// this so the code wont be in the same line
        }
    }
}
