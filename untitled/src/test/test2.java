package test;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int[] i = new int[3];
        Scanner scanner = new Scanner(System.in);
        abc : for (int j = 0; j <3 ; j++) {
            int n = (int)(Math.random()*9)+1;
            for (int m: i) {
                if(m==n){
                    j-=1;
                    continue abc;
                }
            }
            i[j]=n;
        }
        int num=0;
        efg : while(true){
            num++;
            if(num>10){
                System.out.println("?");
                switch (scanner.next()){
                    case "Y":
                        num=0;
                        break;
                    case "N":
                        break efg;
                }
            }
            String[] numbs = scanner.nextLine().split(" ");
            int strike,ball;
            strike=ball=0;
            for (int j = 0; j < 3; j++) {
                if(Integer.parseInt(numbs[j])==i[j]){
                    strike+=1;
                }
                else{
                    for (int k = 0; k < 3; k++) {
                        if(i[k]==Integer.parseInt(numbs[j])){
                            ball+=1;
                        }
                    }
                }

            }
            switch (strike){
                case 0:
                    if(ball!=0){
                        System.out.println(ball+"ball");
                    }
                    else{
                        System.out.println("Out");
                    }
                    break ;
                default:
                    if(ball!=0){
                        System.out.println(strike+" strike "+ball+" ball");
                    }
                    else{
                        System.out.println(strike+" strike");
                    }
                    break ;
            }
        }
    }
}
