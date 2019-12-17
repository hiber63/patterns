package cn.hiber.patterns.proxy;

/**
 * @author hiber
 */
public class DefaultMoveable implements Moveable {
    public void walk() {
        System.out.println("DefaultMoveable walking...");

    }

    public void run() {
        System.out.println("DefaultMoveable run...");
    }
}
