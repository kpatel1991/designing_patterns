package Proxy;

/**
 * ProxyPatternMain
 */
public class ProxyPatternMain {

    public static void main(String[] args) {
        System.out.println("** Proxy pattern demo **");
        Proxy px = new Proxy();
        px.doSomeWork();
    }
}