package day05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间为: " + ft.format(dNow));

        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
            Thread.sleep(5 * 60 * 10); // 休眠3秒
            System.out.println(new Date() + "\n");
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Difference is : " + diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }

        // System.currentTimeMillis();
        Date date = new Date();//默认是当前时间!
        int year = date.getYear() + 1900;
        int month = date.getMonth() + 1;
        System.out.println(year + ","+month);

        date.setTime(0);//穿越到 1970 元旦
        year = date.getYear() + 1900;
        month = date.getMonth() + 1;
        System.out.println(year + ","+month);

        date.setTime(-1000*60*60*9);//穿越到 1969年的最后一天
        year = date.getYear() + 1900;
        month = date.getMonth() + 1;
        System.out.println(year + ","+month);

        long now = System.currentTimeMillis();
        date.setTime(now + 1000L*60*60*24 );
        SimpleDateFormat fmt =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = fmt.format(date);//最便捷的时间输出
        System.out.println(str);
        System.out.println(fmt.format(0));//Java API 没有说明!
    }
}
