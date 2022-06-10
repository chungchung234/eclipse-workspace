package Basebaall_team;

public class Human {
    //번호, 이름, 나이, 키 / picture : 승, 패, 방어율, batter : 타수, 안타수, 타율
    private int num;
    private String name;
    private int age;
    private Double height;

    @Override
    public String toString() {
        return "Human{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public Human(int num, String name, int age, Double height) {
        this.num = num;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

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

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
