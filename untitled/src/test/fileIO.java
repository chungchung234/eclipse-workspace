package test;

import java.io.*;

public class fileIO {
    public static void main(String[] args) throws IOException {
        File file = new File("");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        pw.println("asdsad");
        pw.close();


        /*
        File file = new File("c:\\");
        File filelist[] = file.listFiles();

        for (int i = 0; i < filelist.length; i++) {
            if (filelist[i].isFile()) {
                System.out.println("[File]" + filelist[i].getName());
            } else if (filelist[i].isDirectory()) {
                System.out.println("[Folder]" + filelist[i].getName());
            } else {
                System.out.println("[?]" + filelist[i].getName());
            }
        }

        */
        /*
        File newfile = new File("c:\\Temp\\newfile.txt");

        if(newfile.createNewFile()){
            System.out.println("success");
        }else {
            System.out.println("fail");
        }*/


    }
}
