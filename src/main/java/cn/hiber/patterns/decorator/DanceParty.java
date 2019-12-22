package cn.hiber.patterns.decorator;

/**
 * @author hiber
 */
public class DanceParty extends PartyDecorator {
    public DanceParty(Party party) {
        super(party);
    }

    @Override
    public void fun() {
        super.fun();
        System.out.println("dance");
    }
}
