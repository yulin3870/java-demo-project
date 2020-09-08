package day01;

/**
 * int 类型的包装类 Integet
 */
public class IntegetDemo {
    public static void main(String[] args){
        Integer i = new Integer(1) ;
        Integer i2 = new Integer(1) ;

        System.out.println(i == i2) ;// false


        //建议选择使用valueOf的形式创建包装类
        Integer i3 = Integer.valueOf(1) ;
        Integer i4 = Integer.valueOf(1) ;

        System.out.println(i3 == i4) ;// true


        Integer i5 = Integer.valueOf(50) ;
        int i6 = i5.intValue() ;//将包装类转换为基本类型数据

        Double d = new Double(1.2) ;
        double dd = d.doubleValue() ;

        /**
         * java 1.4 下面的代码不行，有语法错误
         * java 1.5 下面的代码可以，因为 1.5 以后多了个特性
         * 	自动拆箱：自动将包装类对象转换为基本类型
         * 	自动装箱：自动将基本类型数据转换为包装类对象
         */
        int a = i5 ;				//自动拆箱				对象-->基本类型
        Integer aa = 1 ;		//自动装箱	   基本对象-->对象


    }
}
