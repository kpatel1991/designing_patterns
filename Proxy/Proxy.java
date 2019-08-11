package Proxy;

/**
 * Proxy
 */
public class Proxy extends Subject{

    ConcreateSubject cs;

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening now!!");
        if(cs == null){
            cs = new ConcreateSubject();
        }
        cs.doSomeWork();
    }

    
}