package test;

import java.util.Arrays;

public class sol {
    public static void main(String[] args) {
        // 다음 암호표로 문자열을 암호화하고 다시 복호화한 결과를 출력하라.

        // 암호표
        // 알파벳
        char[] abcCode ={
                '`','~','!','@','#', '$','%','^','&','*',
                '(',')','-','_','+', '=','|','[',']','{',
                '}',';',':',',','.', '/'
        };
        // 숫자
        char[] numCode = {'q','w','e','r','t', 'y','u','i','o','p'};

        String src = "abc123";

        String result = new String(encrypt(abcCode,numCode,src));

        // 암호화 코드
        System.out.println(result);

        // 복호화
        String baseCode = new String(decrypt(abcCode,numCode,result));

        // 복호화 코드
        System.out.println(baseCode);
    }
    static char[] encrypt(char[] abcCode,char[] numCode, String src){
        char[] encode = new char[src.length()];

        for (int i = 0; i < src.length(); i++) {
            if(isABC(src.charAt(i))){
                int n =src.charAt(i)-'a';
                encode[i]=abcCode[n];
            }
            else{
                encode[i]=numCode[src.charAt(i)-'0'];
            }
        }

        return encode;
    }

    static char[] decrypt(char[] abcCode, char[] numCode, String src){
        char[] decode = new char[src.length()];
        for (int i = 0; i < src.length(); i++) {
            int tf=isabcCode(abcCode,src.charAt(i));
            if(tf !=-1){
                decode[i]= (char) ('a'+i);
            }
            else{
                for (int j = 0; j < numCode.length; j++) {
                    if(numCode[j] == src.charAt(i)){

                        decode[i]=(char)('0'+j);
                    }
                }

            }
        }
        return decode;
    }

    private static int isabcCode(char[] abcCode, char charAt) {
        for (int i = 0; i < abcCode.length; i++) {
            if(abcCode[i]==charAt){
                return i;
            }
        }
        return -1;
    }

    public static boolean isABC(char c){

        if (c >= 'A' && c<= 'z') {
            return true;
        }
        return false;
    }
}
