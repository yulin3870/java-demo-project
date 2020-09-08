package day04;

public class Demo01 {
    public static void main(String args[]){
        EncapTest encap = new EncapTest();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");
        System.out.print("Name : " + encap.getName()+  " Age : "+ encap.getAge());
    }
}

   /**
    以下实例中public方法是外部类访问该类成员变量的入口。
    通常情况下，这些方法被称为getter和setter方法。
    因此，任何要访问类中私有成员变量的类都要通过这些getter和setter方法。
    */
class EncapTest{
    private String name;
    private String idNum;
    private int age;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getIdNum(){
        return idNum;
    }

    public void setAge( int newAge){
        age = newAge;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setIdNum( String newId){
        idNum = newId;
    }
}