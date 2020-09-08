package day05;

import java.util.Calendar;

public class DateDemo03 {
    public static void main(String[] args) {
        //Calender的月份是从0开始的，但日期和年份是从1开始的

        Calendar c1 = Calendar.getInstance();
        c1.set(2020, 1, 1);
        System.out.println(c1.get(Calendar.YEAR)
                + "-" + c1.get(Calendar.MONTH)
                + "-" + c1.get(Calendar.DATE));

        c1.set(2020, 1, 0);
        System.out.println(c1.get(Calendar.YEAR)
                + "-" + c1.get(Calendar.MONTH)
                + "-" + c1.get(Calendar.DATE));

        c1.set(2020, 2, 0);
        System.out.println(c1.get(Calendar.YEAR)
                + "-" + c1.get(Calendar.MONTH)
                + "-" + c1.get(Calendar.DATE));

        c1.set(2020, 2, -10);
        System.out.println(c1.get(Calendar.YEAR)
                + "-" + c1.get(Calendar.MONTH)
                + "-" + c1.get(Calendar.DATE));
    }
}
