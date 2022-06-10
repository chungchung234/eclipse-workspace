package SingletonEX;

public class MainClass {
    public static void main(String[] args) {
        MyClass mc = new MyClass(123);
        YouClass yc = new YouClass();

        mc.method();
        yc.func();
        System.out.println(yc.toStrings());
        System.out.println(SingletonClass.getInstance());
        HeClass he = new HeClass();
        he.proc();
        System.out.println(he.toString());
    }
}
