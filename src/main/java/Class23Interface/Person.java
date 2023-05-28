package Class23Interface;

public interface Person {
    void eat();

}
interface Employee extends Person{
    void work();
}
class Tester implements Employee{

    @Override
    public void eat() {

    }
    public void work(){

    }
}