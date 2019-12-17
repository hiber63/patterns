package cn.hiber.patterns.proxy;

/**
 * @author hiber
 */
public class MoveableStaticProxy implements Moveable {

    Moveable moveable;

    public MoveableStaticProxy(Moveable moveable) {
        this.moveable = moveable;
    }

    public void walk() {
        moveable.walk();
        System.out.println("static log...");
    }

    public void run() {
        moveable.run();
        System.out.println("static log...");
    }
}
