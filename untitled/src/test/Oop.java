package test;

public class Oop {
    int number,height;
    String name;

    public  Oop(){

        System.out.println("MyClass MyClass()");
        number = 1;
        name = "chung";
        height = 180;
    }
    public Oop getThis(){
        return this;
    }
    /**
     * constructor
     * @param number int
     * @param name String
     */
    public Oop(int number, String name){
        this.name = name;
        this.number = number;
    }
    public static void main(String[] args) {
        Override o = new Override();
        Override2 o2 = new Override2();

        ParentsClass pc1 = new Override();
        ParentsClass pc2 = new Override2();
        o.method();
        pc1.method();
        pc2.method();
    }

}
