package test;

import java.io.*;

public class fileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("");
        /*
        FileReader fr = new FileReader(file);
        int ch;
        while ((ch =fr.read())!=-1){
            System.out.println((char)ch);

        }
        fr.close();*/
        BufferedReader br = new BufferedReader(new FileReader(file));

        String str = "";
        while((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
    }
}
