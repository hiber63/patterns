package cn.hiber.jvm.gc;

/**
 * 一个对象的finalize方法只会被系统自动调用一次
 * @author hiber
 */
public class EscapeGc {

    public static EscapeGc OBJ = null;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("执行finalize，接着将其赋值给成员变量");
        OBJ = this;
    }

    public static void main(String[] args) throws InterruptedException {
        OBJ = new EscapeGc();

        for(int i=0;i<3;i++) {
            OBJ = null;
            System.gc();
            //finalize优先级低
            Thread.sleep(500);
            if(OBJ != null) {
                System.out.println("alive");
            } else {
                System.out.println("dead");
            }
        }
    }
}
