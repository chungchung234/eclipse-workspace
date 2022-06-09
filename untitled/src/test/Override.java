package test;

public class Override extends ParentsClass{
    public void method(){
        //super.method();
        System.out.println("Override");
    }
    public static void main(String[] args) {
        Override or = new Override();
        or.method();
    }
}
