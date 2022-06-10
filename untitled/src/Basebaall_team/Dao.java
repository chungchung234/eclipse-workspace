package Basebaall_team;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dao {
    static Scanner scanner = new Scanner(System.in);
    private static Dao dao = new Dao();
    int counter;

    public static void insert(ArrayList<Human> data) {
        String temp[];
        int n =scanner.nextInt();
        switch (n) {
            case 1 -> {
                temp = scanner.nextLine().split("/");
                data.add(new Batter(Integer.parseInt(temp[0]), temp[1], Integer.parseInt(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]), Integer.parseInt(temp[5]), Double.parseDouble(temp[6])));
            }
            case 2 -> {
                temp = scanner.nextLine().split("/");
                data.add(new Picture(Integer.parseInt(temp[0]), temp[1], Integer.parseInt(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]), Integer.parseInt(temp[5]), Double.parseDouble(temp[6])));
            }
        }
    }

    public static void delete(ArrayList<Human> data) {


    }

    public static void search(ArrayList<Human> data) {
    }

    public static void modify(ArrayList<Human> data) {
    }

    public static void saveFile(ArrayList<Human> data) throws IOException {


        FileIO.saveFile(data);
    }

    public static ArrayList<Human> readFile() throws IOException {

        ArrayList<Human> data = FileIO.readFile();
        for (Human human:
             data) {
            System.out.println(human.toString());
        }
        return data;
    }
}
