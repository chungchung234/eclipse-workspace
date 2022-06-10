package SingletonEX;

public class MyClass {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void method(){
        SingletonClass sc = SingletonClass.getInstance();
        sc.num = number;
    }

    public MyClass(int number) {
        this.number = number;
    }
}
