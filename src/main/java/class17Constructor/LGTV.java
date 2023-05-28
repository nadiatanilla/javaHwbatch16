package class17Constructor;

import class18Enheritance.TV;

public class LGTV extends TV {
    void printMake(){
        System.out.println(make);
        // protected access only in another package inherited
    }
}
