package Abstract;

public class MyClass extends AbstractClass implements myinterface, newinterface{
    @Override
    public void method() {
        super.method();
        System.out.println("Myclass abstractClass()");
    }

    @Override
    public void method(int n) {

    }

    @Override
    public void func(int i) {
        System.out.println("MyClass func int");
    }

    @Override
    public void func(String str) {
        System.out.println("MyClass func str");
    }
}
