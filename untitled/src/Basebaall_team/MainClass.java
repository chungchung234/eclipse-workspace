package Basebaall_team;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Human> data = null;
        loop: while (true){
            int n = scanner.nextInt();
            switch (n){
                case 1:
                    Dao.insert(data);
                    break;
                case 2:
                    Dao.delete(data);
                    break;
                case 3:
                    Dao.search(data);
                    break;
                case 4:
                    Dao.modify(data);
                    break;
                case 5:
                    Dao.saveFile(data);
                    break ;
                case 6:
                    data = Dao.readFile();
                    break;
                case 7:
                    break loop;
            }
        }


    }

}
