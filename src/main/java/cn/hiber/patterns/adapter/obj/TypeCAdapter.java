package cn.hiber.patterns.adapter.obj;

import cn.hiber.patterns.adapter.clazz.NotTypeC;
import cn.hiber.patterns.adapter.clazz.TypeC;

/**
 * 类适配器模式和对象适配器模式最大的区别在于适配器和适配者之间的关系不同，
 * 对象适配器模式中适配器和适配者之间是关联关系，而类适配器模式中适配器和适配者是继承关系
 * @author hiber
 */
public class TypeCAdapter implements TypeC {

    private NotTypeC notTypeC;

    public TypeCAdapter(NotTypeC notTypeC) {
        this.notTypeC = notTypeC;
    }

    public void connectByTypeC() {
        notTypeC.connectNoTypeC();
    }
}
