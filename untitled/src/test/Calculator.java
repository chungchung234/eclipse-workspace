package test;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2;

        String oper;

        num1 = insertNum();

        oper = insertOper();

        num2 = insertNum();

        int result =0 ;
        switch (oper){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1/num2;
                break;
        }
        System.out.println(result);
    }

    static String insertOper(){
        String[] operator = {"+","-","*","/"};
        System.out.println("연산자를 입력하세요.");
        String Oper = scanner.next();
        if(Arrays.asList(operator).contains(Oper)){
            return Oper;
        }
        else{
            return insertOper();
        }
    }

    static int insertNum(){
        int n=0;
        try{
            System.out.println("숫자 입력");
            n = scanner.nextInt();
        }catch (Exception e){
            System.out.println("숫자를 입력하세요");
            return insertNum();
        }
        return n;
    }

}
