package day07;

public class ExcepDemo03 {
    private int age ;

    public int getAge(){
        return age ;
    }

    public void setAge(int age){
        if(age > 100){
            throw new RuntimeException("年龄不合法") ;
        }
        this.age = age	;
    }

    public static void main(String[] args){
        ExcepDemo03 p = new ExcepDemo03() ;
        try{
            p.setAge(1000) ;
        }catch(Exception e){
            /**
             * 	获取异常的信息
             */
            System.out.println(e.getMessage()) ;
            // 输出异常的堆栈信息，就是异常出现的执行过程
            e.printStackTrace() ;
        }
    }
}
