package generic;

public class GenericClass {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(123);
        System.out.println(box.getTemp());

        Box<String> sbox = new Box<>("124");
        System.out.println(sbox.getTemp());

        Boxmap<String,Integer> bm = new Boxmap<>("name",123);

        System.out.println(bm.getName()+bm.getValue());
    }


}

class Box<T>{
    T temp;

    public Box(T temp) {
        this.temp = temp;
    }

    public void setTemp(T temp) {
        this.temp = temp;
    }

    public T getTemp() {
        return temp;
    }
}

class Boxmap<K,V>{
    K name;
    V value;

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Boxmap(K name, V value) {
        this.name = name;
        this.value = value;
    }
}