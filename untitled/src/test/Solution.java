package test;

import java.util.Arrays;
/*
public class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i=0;
        for(int[] command : commands){
            int temp[] = array.clone();
            Arrays.sort(temp,command[0]-1,command[1]);
            answer[i]= temp[command[0]+command[2]-2];
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        String num1 = "125";
        String num2 = "20";
        System.out.println(num2.compareTo(num1));
        //solution(new int[]{1, 5, 2, 6, 3, 7, 4},new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    }

}
*/
import java.util.Arrays;

class Solution {
    public static String solution(int[] numbers) {

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length;j++){
                String num1=Integer.toString(numbers[i]);
                String num2=Integer.toString(numbers[j]);
                if(num1.compareTo(num2)<0){
                    int temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }

        }

        String answer = Arrays.toString(numbers).replaceAll("[^0-9]","");
        return answer;
    }

    public static void main(String[] args) {
        String num1 = "3";
        String num2="30";
        System.out.println(num1.compareTo(num2));
        System.out.println(solution(new int[] {6, 10, 2}));
    }
}