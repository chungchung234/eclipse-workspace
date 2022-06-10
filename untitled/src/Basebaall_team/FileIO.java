package Basebaall_team;

import java.io.*;
import java.util.ArrayList;

public class FileIO {
    private static File file = new File("Baseball_team.txt");


    static void saveFile(ArrayList<Human> data) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        for (int i = 0; i < data.size(); i++) {
                if(data.get(i) instanceof Batter){

                    bw.write("Batter"+data.get(i).toString());
                }else{
                    bw.write("Picture"+data.get(i).toString());
                }
        }
        bw.close();
    }

    static ArrayList<Human> readFile() throws IOException {
        if(!file.exists()){
            file.createNewFile();
        }
        ArrayList<Human> txt = new ArrayList<Human>();
        String str = "";

        BufferedReader br = new BufferedReader(new FileReader(file));
        while ((str=br.readLine())!=null){
            String temp[] = str.split("/");
            if(temp[0].equals("Batter")){
                txt.add(new Batter(Integer.parseInt(temp[1]),temp[2],Integer.parseInt(temp[3]),Double.parseDouble(temp[4]),Integer.parseInt(temp[5]),Integer.parseInt(temp[6]),Double.parseDouble(temp[7])));
            }{
                txt.add(new Picture(Integer.parseInt(temp[1]),temp[2],Integer.parseInt(temp[3]),Double.parseDouble(temp[4]),Integer.parseInt(temp[5]),Integer.parseInt(temp[6]),Double.parseDouble(temp[7])));
            }
        }
        br.close();
        return txt;
    }

}
