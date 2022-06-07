package test;

import java.util.Scanner;

public class testClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tf=true;
        String str = scanner.next();
        for (int i = 0; i < str.length(); i++) {
            if('9'<str.charAt(i)|| '0'>str.charAt(i)){
                tf=false;
                break;
            }
        }
        if(tf){
            System.out.println("숫자로 되어 있습니다");
        }
        else{
            System.out.println("숫자가 아닙니다.");
        }
    }
}
