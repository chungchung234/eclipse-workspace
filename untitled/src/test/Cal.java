package test;

import java.util.Calendar;

public class Cal {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        cal.set(Calendar.DAY_OF_MONTH , 1);
        int firstWeek = cal.get(Calendar.DAY_OF_WEEK);
        for (int j = 0; j < firstWeek; j++) {
            System.out.print(
                    "*"
            );

        }
        for (int i = 1; i < lastDay+1; i++) {
            System.out.print(i);
            if((i+firstWeek)%7==0){
                System.out.println();
            }
        }

        System.out.println();

    }
}
