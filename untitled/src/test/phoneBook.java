package test;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class phoneBook {
    static File file = new File("PhoneNum.txt");
    static Scanner scanner = new Scanner(System.in);
    static PrintWriter pw;

    static BufferedReader br;



    public static void main(String[] args) throws IOException {
        if(!file.exists()){
            file.createNewFile();
        }

        loop:while (true){
            System.out.println("Menu \n1.Add\n2.Delete\n3.Search\n4.Modify\n5.All_data\n6.Data_Save\n7.Exit");
            int n = scanner.nextInt();
            switch (n){
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    modify();
                    break;
                case 5:
                    all_data();
                    break;
                case 6:
                    data_save();
                    break;
                case 7:
                    br.close();
                    pw.close();
                    scanner.close();

                    break loop;
            }

        }
    }

    private static void data_save() {

    }

    private static void all_data() throws IOException {
        br = new BufferedReader(new FileReader(file));

        String str = "";
        while((str = br.readLine()) != null){
            System.out.println(str);
        }

        br.close();
    }

    private static void modify() throws IOException {
        System.out.println("Search What?\n1.name\n2.phoneNumber");
        br = new BufferedReader(new FileReader(file));

        int n = scanner.nextInt();
        String str;
        switch (n){
            case 1:
                System.out.println("name:");
                String name = scanner.next();
                str = "";
                while((str = br.readLine()) != null){
                    if(Arrays.asList(str.split(",")[0]).contains(name)) System.out.println(str);
                }
                break;
            case 2:
                System.out.println("phoneNumber:");
                String phoneNumber = scanner.next();
                str = "";
                while((str = br.readLine()) != null){
                    if(Arrays.asList(str.split(",")[1]).contains(phoneNumber)) System.out.println(str);
                }
                break;
            default:
                br.close();
        }
    }

    private static void search() throws IOException {
        System.out.println("Search What?\n1.name\n2.phoneNumber");
        br = new BufferedReader(new FileReader(file));

        int n = scanner.nextInt();
        String str;
        switch (n){
            case 1:
                System.out.println("name:");
                String name = scanner.next();
                str = "";
                while((str = br.readLine()) != null){
                    if(Arrays.asList(str.split(",")[0]).contains(name)) System.out.println(str);
                }
                break;
            case 2:
                System.out.println("phoneNumber:");
                String phoneNumber = scanner.next();
                str = "";
                while((str = br.readLine()) != null){
                    if(Arrays.asList(str.split(",")[1]).contains(phoneNumber)) System.out.println(str);
                }
                break;
            default:
                br.close();
        }
    }

    private static void delete() throws IOException {
        System.out.println("Search What?\n1.name\n2.phoneNumber");
        br = new BufferedReader(new FileReader(file));

        int n = scanner.nextInt();
        String str;
        switch (n){
            case 1:
                System.out.println("name:");
                String name = scanner.next();
                str = "";
                while((str = br.readLine()) != null){
                    if(Arrays.asList(str.split(",")[0]).contains(name)) System.out.println(str);
                }
                break;
            case 2:
                System.out.println("phoneNumber:");
                String phoneNumber = scanner.next();
                str = "";
                while((str = br.readLine()) != null){
                    if(Arrays.asList(str.split(",")[1]).contains(phoneNumber)) System.out.println(str);
                }
                break;
            default:
                br.close();
        }
    }

    private static void add() throws IOException {
        pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));

        System.out.println("Name/Age/phoneNumber/temp1/temp2");
        String name =scanner.next();
        String age = scanner.next();
        String phoneNum = scanner.next();
        String temp1 = scanner.next();
        String temp2 = scanner.next();

        pw.println(name+","+age+","+phoneNum+","+temp1+","+temp2);
        pw.close();
    }
}
