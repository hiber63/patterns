package cn.hiber.patterns.decorator;

/**
 * @author hiber
 */
public class Demo {

    public static void main(String[] args) {
        Party decorator = new DanceParty(new SingParty(new EasyParty()));
        decorator.fun();
    }

}
