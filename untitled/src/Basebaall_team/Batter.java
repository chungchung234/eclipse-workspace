package Basebaall_team;

public class Batter extends Human{
    private static Basebaall_team.Batter Batter;
    private int hit;
    private int hit_Save;
    private double per_hit;

    public Batter(int num, String name, int age, double height, int hit, int hit_Save, double per_hit) {
        super(num, name, age, height);
        this.hit = hit;
        this.hit_Save = hit_Save;
        this.per_hit = per_hit;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getHit_Save() {
        return hit_Save;
    }

    public void setHit_Save(int hit_Save) {
        this.hit_Save = hit_Save;
    }

    public double getPer_hit() {
        return per_hit;
    }

    public void setPer_hit(double per_hit) {
        this.per_hit = per_hit;
    }

    @Override
    public String toString() {
        return
                "Batter"+"/"+getNum()+"/"+getName()+"/"+getAge()+"/"+getHeight()+"/"+getHit()+"/"+getHit_Save()+"/"+getPer_hit();
    }

    public static Batter getInstance() {
        return Batter;
    }
}
