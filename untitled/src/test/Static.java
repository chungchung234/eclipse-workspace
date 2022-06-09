package test;

public class Static {

    private int number; //멤버변수
    static int stnum;//전역변수
    public static Static getObject(){
        Static st = new Static();
        st.method(1);
        return st;
    }
    public void method(int num){//매개변수
        int localNum;//지역변수
    }

}
