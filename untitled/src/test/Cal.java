package test;

import java.util.Calendar;

public class Cal {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1; // 0~11 로 계산 따라서 +1 필수
        int day = cal.get(Calendar.DATE);
6
        System.out.println();

    }
}
