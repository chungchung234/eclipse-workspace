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
        int array[] = {1,2,3};
        Oop O = new Oop();
        Oop O1 = new Oop(25,"chung");
        System.out.println(O1.toString());
        System.out.println(O.getThis());
    }

}
