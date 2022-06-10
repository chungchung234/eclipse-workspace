package SingletonEX;

public class SingletonClass {
    public int num;
    private static SingletonClass sc = null;

    private SingletonClass(){

    }

    public static SingletonClass getInstance() {
        if(sc==null){
            sc = new SingletonClass();
        }
        return sc;

    }
}
