package test;

public class Override2 extends ParentsClass{
    @java.lang.Override
    public void method() {
        super.method();
        System.out.println("Override2");
    }
}
