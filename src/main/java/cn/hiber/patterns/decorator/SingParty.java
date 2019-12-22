package cn.hiber.patterns.decorator;

/**
 * @author hiber
 */
public class SingParty extends PartyDecorator {

    public SingParty(Party party) {
        super(party);
    }

    @Override
    public void fun() {
        super.fun();
        System.out.println("sing");
    }
}
