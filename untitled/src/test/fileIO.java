package test;

import java.io.File;
import java.io.IOException;

public class fileIO {
    public static void main(String[] args) throws IOException {
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
        File newDir = new File("Temp");
        if(newDir.exists()){
            System.out.println("존재");
        }

    }
}
