package test;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int sum=0;
            sum+=(int)(Math.random()*13)+1+(int)(Math.random()*13)+1;
            System.out.println(sum);
            while(true){
                System.out.println("카드를 더 받으시겠습니까?");
                if(scanner.next().equals("Y")){

                    sum+=(int)(Math.random()*13)+1;
                    System.out.println(sum);

                }
                else{
                    break;
                }
            }
            if(sum==21){
                System.out.println("win");
            }
            else if(sum<21){
                System.out.println(21-sum);
            }
            else{
                System.out.println("you lose");
            }
            System.out.println("restart? Y:N");
            if(scanner.next()=="N"){
                break;
            }
        }
    }
}
