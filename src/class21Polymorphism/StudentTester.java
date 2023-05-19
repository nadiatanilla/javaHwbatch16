package class21Polymorphism;

public class StudentTester {
    public static void main(String[] args) {
        Student [] student={new SyntaxStudent(),
        new CollegeStudent(),
        new SchoolStudent()};
        for(Student st:student){
            if(st instanceof SyntaxStudent){
                ((SyntaxStudent)st).practice();
            }else if(st instanceof SchoolStudent){
                ((SchoolStudent)st).graduate();
            }
            st.learn();
            st.speak();
            st.understand();
        }
        Student st=new SyntaxStudent();// we can not convert subclasses but with multilevel
        ((SyntaxStudent)st).practice();
        Student std=new CollegeStudent();
        ((CollegeStudent)std).revise();
        Student stdt=new SchoolStudent();
        if(stdt instanceof SyntaxStudent){
            ( (SyntaxStudent)stdt).practice();
        }else{
            System.out.println("Wrong type of object is present in syntax ");
        }

        ((SchoolStudent)stdt).graduate();
    }
}
