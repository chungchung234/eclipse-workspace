package Basebaall_team;

public class Picture extends Human{
    private static Basebaall_team.Picture Picture;
    int win;
    int lose;
    double per_save;

    public Picture(int num, String name, int age, Double height, int win, int lose, double per_save) {
        super(num, name, age, height);
        this.win = win;
        this.lose = lose;
        this.per_save = per_save;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public double getPer_save() {
        return per_save;
    }

    public void setPer_save(double per_save) {
        this.per_save = per_save;
    }

    public static Picture getInstance() {
        return Picture;
    }
    @Override
    public String toString() {
        return  "Picture"+"/"+getNum()+"/"+getName()+"/"+getAge()+"/"+getHeight()+"/"+getWin()+"/"+getLose()+"/"+getPer_save();
    }
}
