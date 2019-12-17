package cn.hiber.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK Proxy
 * @author hiber
 */
public class MoveableDynamicProxyFactory implements InvocationHandler {

    private Object delegate;

    public Object getProxy(Object implObj) {
        delegate = implObj;
        return Proxy.newProxyInstance(implObj.getClass().getClassLoader(), implObj.getClass().getInterfaces(),
                this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object o = null;
        try {
            o = method.invoke(this.delegate, args);
            System.out.println("dynamic log...");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return o;
    }

    public static void main(String[] args) {
        MoveableDynamicProxyFactory proxyFactory = new MoveableDynamicProxyFactory();
        Moveable proxy1  = (Moveable)proxyFactory.getProxy(new DefaultMoveable());
        proxy1.walk();
        proxy1.run();

        Moveable proxy2  = (Moveable)proxyFactory.getProxy(new MoveableStaticProxy(new DefaultMoveable()));
        proxy2.walk();
        proxy2.run();
    }
}
