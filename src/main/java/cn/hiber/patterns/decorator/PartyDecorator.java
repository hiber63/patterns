package cn.hiber.patterns.decorator;

/**
 * @author hiber
 */
public abstract class PartyDecorator implements Party {

    protected final Party party;

    public PartyDecorator(Party party) {
        this.party = party;
    }

    public void fun() {
        party.fun();
    }
}
