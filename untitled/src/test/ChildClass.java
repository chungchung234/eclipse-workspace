package test;

public class ChildClass extends ParentsClass{
    public ChildClass(){
        System.out.println("child");
    }
    public ChildClass(String str){
        super("super");
        System.out.println("child str");
    }
    public static void main(String[] args) {
        ChildClass cc = new ChildClass("str");
        cc.method();
    }
}
