package test;

import java.util.Arrays;
import java.util.Scanner;

public class Solting {
    public static void main(String[] args) {
        int number[] = {4,3,5,2,1};

        //선택 정렬
        /*
        for (int i = 0; i < number.length -1 ; i++) {
            for (int j = i+1; j < number.length; j++) {
                if(number[i]>number[j]){
                    int temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }

        }
        */
        //몇개 정렬 갯수에 맞게 배열 할당, 숫자 입력

        //입력부
        /*
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int numbers[] = new int[n];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
        }

        String UpDown = scanner.next();


        //선택 정렬
        for (int i = 0; i < numbers.length -1 ; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                switch (UpDown){
                    case "Up":
                        if(numbers[i]>numbers[j]){
                            int temp=numbers[i];
                            numbers[i]=numbers[j];
                            numbers[j]=temp;
                        }
                        break;
                    case "Down":
                        if(numbers[i]<numbers[j]){
                            int temp=numbers[i];
                            numbers[i]=numbers[j];
                            numbers[j]=temp;
                        }
                }

            }

        }
        */



        //출력
        //System.out.println(Arrays.toString(numbers));

        System.out.println(isDouble("3.14"));
        System.out.println(isLower("AAa"));
        System.out.println(Arrays.toString(divide(18,5)));
    }

    public static boolean isDouble(String str){
        try{
            Double n = Double.parseDouble(str);
        }
        catch (Exception e){
            return false;
        }
        return str.contains(".");
    }

    public static boolean isLower(String str){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                return true;
            }
        }
        return false;
    }

    public static int[] divide(int num1, int num2){
        int result[] = new int[2];

        result[0]=num1/num2;
        result[1]=num1%num2;
        return result;
    }
}
