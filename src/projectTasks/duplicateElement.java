package projectTasks;

public class duplicateElement {
    public static void main(String[] args) {
        String[]names={"Tanilla","Fatima","Rida","Anissa","Fatima","Anna"};
        for(int i=0;i<names.length;i++){
            for(int j=i+1;j< names.length;j++){
                if(names[i]==names[j]){
                    System.out.println("The duplicate name is "+ names[j]);
                }
            }
        }
    }
}
