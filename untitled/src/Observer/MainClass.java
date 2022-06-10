package Observer;

import java.util.Observable;

public class MainClass extends Observable {

    private String perArg=null;

    @Override
    public void notifyObservers(Object arg) {
        String str = (String) arg;
        if(str.equals(perArg))return;
        perArg = str;

        setChanged();

        super.notifyObservers(arg);
    }

    public static void main(String[] args) {

    }
}
