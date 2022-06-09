package generic;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {

        List<MyData> obj = new ArrayList<MyData>();

        obj.add(new MyData("chung1",124));
        obj.add(new MyData("chung2",224));
        obj.add(new MyData("chung3",324));
        obj.add(new MyData("chung4",424));
        obj.add(new MyData("chung5",524));

        obj.add(2,new MyData("insert",123));

        for (MyData myData : obj) {
            if (myData.getName().equals("insert")) {
                System.out.println(myData.getName() + myData.getAge());
            }
        }

        MyData md = new MyData("insert",1234);

        for (int i = 0; i < obj.size(); i++) {
            
        }


    }






}

class MyData{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}