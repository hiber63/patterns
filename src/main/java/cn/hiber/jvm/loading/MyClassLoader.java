package cn.hiber.jvm.loading;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author hiber
 */
public class MyClassLoader extends ClassLoader {

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        try {
            InputStream inputStream = getClass().getResourceAsStream(name.substring(name.lastIndexOf(".") + 1) + ".class");
            if(inputStream == null) {
                return super.loadClass(name);
            }
            byte[] b = new byte[inputStream.available()];
            inputStream.read(b);
            return defineClass(name, b, 0, b.length);
        } catch (IOException e) {
            throw new ClassNotFoundException(name);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> myClazz = new MyClassLoader().loadClass("cn.hiber.jvm.loading.MyClassLoader");
        Class<MyClassLoader> clazz = MyClassLoader.class;
        System.out.println("done");
    }

}
