package Proxy;

/**
 * ConcreateSubject
 */
public class ConcreateSubject extends Subject{

    @Override
    public void doSomeWork() {
        System.out.println("This is concreate Subject.");
    } 
}