package test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 3;
        String[][] students = new String[3][5];
        int max=0;
        int whomax=0;
        int whomin =0;
        int min=100;
        for (int i=0; i<num;i++) {
            students[i] = scanner.nextLine().split(" ");
            if(Integer.parseInt(students[i][2])>=max){
                max=Integer.parseInt(students[i][2]);
                whomax=i;
            }
            if(Integer.parseInt((students[i][3]))<=min){
                min=Integer.parseInt(students[i][3]);
                whomin=i;
            }
            int sum=Integer.parseInt(students[i][2])+Integer.parseInt(students[i][3])+Integer.parseInt(students[i][4]);
            System.out.println(sum+""+sum/3);
        }
        System.out.println(students[whomax][0]+max+" "+students[whomin][0]+min);
    }
}
