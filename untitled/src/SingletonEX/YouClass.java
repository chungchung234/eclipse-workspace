package SingletonEX;

public class YouClass {

    private int tag;

    public void setTag(int tag) {
        this.tag = tag;
    }

    public void func(){
        SingletonClass sc = SingletonClass.getInstance();

        tag = sc.num;
    }

    public String toStrings(){
        return Integer.toString(tag);
    }
}
