package generic;

import java.util.ArrayList;
import java.util.HashMap;
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
            if(obj.get(i).equals(md.getName())){
                obj.set(i,md);
            }
        }
        System.out.println(obj.toString());
        for (int i = 0; i < obj.size(); i++) {
            if (obj.get(i).getName().equals(md.getName())) {
                obj.remove(i);
            }
        }


        HashMap<Integer,String > hmap = new HashMap<>();

        hmap.put(1,"one");
        hmap.put(2,"two");

        String val = hmap.get(1);

        hmap.remove(1);



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