package day05;

import java.util.Calendar;

public class DateDemo02 {
    public static void main(String[] args) {

        Calendar c1 = Calendar.getInstance();
        // 获得年份
        int year = c1.get(Calendar.YEAR);
        System.out.println("year：" + year);

        // 获得月份
        int month = c1.get(Calendar.MONTH) + 1;
        System.out.println("month：" + month);

        // 获得日期
        int date = c1.get(Calendar.DATE);
        System.out.println("date：" + date);

        // 获得小时
        int hour = c1.get(Calendar.HOUR_OF_DAY);
        System.out.println("hour：" + hour);

        // 获得分钟
        int minute = c1.get(Calendar.MINUTE);
        System.out.println("minute：" + minute);

        // 获得秒
        int second = c1.get(Calendar.SECOND);
        System.out.println("second：" + second);

        // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
        int day = c1.get(Calendar.DAY_OF_WEEK);
        System.out.println("day：" + day);

    }
}
