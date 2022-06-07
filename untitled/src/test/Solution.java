package test;

import java.util.ArrayList;
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
}*/
/*
class Solution{
    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 10, 10, 10, 10}));
    }
    public static int solution(int[] citations) {
        int answer = 0;
        for (int i = 1; i < citations.length+1; i++) {
            int cnt=0;
            for (int j = 0; j < citations.length; j++) {
                if(citations[j]>=i){
                    cnt++;
                }

            }
            if(cnt>=i){
                answer=i;
            }
        }
        return answer;
    }
}*/


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
}*/
/*
class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1,3,2,4,2})));
    }
    public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        int[] result = {0,0,0};
        for(int i=0;i<answers.length;i++){
            if(answers[i]==i/5){
                result[0]++;
            }
            if(answers[i]==num2[i/8]){
                result[1]++;
            }
            if(answers[i]==num3[i/10]){
                result[2]++;
            }
        }

        System.out.println(Arrays.toString(result));
        return answer;
    }
}*/

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        int[] nums = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            nums[i]=numbers.charAt(i);
        }

        

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("011"));
    }
}