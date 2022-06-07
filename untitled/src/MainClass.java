import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("어느 작업을 하시겠습니까?");
        System.out.println("1. 10진수입력 -> 2진수(String)");
        System.out.println("2. 2진수(String) -> 10진수출력");
        System.out.println("3. 10진수입력 -> 16진수(String)");
        System.out.println("4. 16진수입력(String) -> 10진수출력");
        switch(scanner.nextInt()){
            case 1:
                int n=scanner.nextInt();
                String temp="";
                while(n>0){
                    int i=n%2;
                    temp=Integer.toString(i)+temp;
                    n=n/2;
                }
                System.out.println(temp);
            case 2:
                String bin = scanner.next();
                int result=0;
                for (int i = bin.length()-1; i >= 0; i--) {
                    if(bin.charAt(i)=='1'){

                        result+=Math.pow(2,bin.length()-i-1);
                    }
                }
                System.out.println(result);
            case 3:
                int result2 = scanner.nextInt();
                String hex = "";
                while(result2>0){
                    int m = result2%16;
                    String L="";
                    if(m>=10){
                        switch (m){
                            case 10:
                                L="A";
                            case 11:
                                L="B";
                            case 12:
                                L="C";
                            case 13:
                                L="D";
                            case 14:
                                L="E";
                            case 15:
                                L="F";
                        }
                    }
                    else{
                        L=Integer.toString(m);
                    }
                    result2=result2/16;
                    hex=L+hex;

                }
                System.out.println("0x"+hex);
            case 4:
                String hex1 = scanner.next();
                int result1=0;
                for (int i = 0; i < hex1.length(); i++) {
                    double pow = Math.pow(16, hex1.length() - i - 1);
                    switch (hex1.charAt(i)){
                        case 'A':
                            result1+= pow *10;
                        case 'B':
                            result1+= pow *11;
                        case 'C':
                            result1+= pow *12;
                        case 'D':
                            result1+= pow *13;
                        case 'E':
                            result1+= pow *14;
                        case 'F':
                            result1+= pow *15;
                        default:
                            int a=Character.getNumericValue(hex1.charAt(i));
                            result1+= pow *a;
                    }

                }
                System.out.println(result1);
        }





    }

}
