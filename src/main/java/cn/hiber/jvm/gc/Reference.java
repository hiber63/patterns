package cn.hiber.jvm.gc;

/**
 * @author hiber
 */
public class Reference {

    Object instance = null;

    public static void main(String[] args) {
        Reference a = new Reference();
        Reference b = new Reference();
        a.instance = b;
        b.instance = a;

        System.gc();
    }

}
