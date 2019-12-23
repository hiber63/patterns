package cn.hiber.patterns.adapter.clazz;

/**
 *
 * 由于Java、C#等语言不支持多重类继承，因此类适配器的使用受到很多限制，例如如果目标
 * 抽象类Target不是接口，而是一个类，就无法使用类适配器；此外，如果适配者Adapter为最终
 * (Final)类，也无法使用类适配器。在Java等面向对象编程语言中，大部分情况下我们使用的是
 * 对象适配器，类适配器较少使用。
 * Adapter
 * @author hiber
 */
public class TypeCAdapter extends NotTypeC implements TypeC {
    public void connectByTypeC() {
        connectNoTypeC();
    }
}
