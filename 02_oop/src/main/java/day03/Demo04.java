package day03;

/**
    尽管不能实例化一个 Aoo 类的对象，但是如果我们实例化一个 Boo 类对象，
    该对象将从 Aoo 类继承 7 个成员方法，且通过该方法可以设置或获取三个成员变量。
*/
public class Demo04 {
    public static void main(String [] args) {
        Boo b = new Boo("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Aoo a = new Boo("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        b.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference--");
        a.mailCheck();
    }
}

abstract class Aoo {
    private String name;
    private String address;
    private int number;
    public Aoo(String name, String address, int number) {
        System.out.println("Constructing an Aoo");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public double computePay() {
        System.out.println("Inside Aoo computePay");
        return 0.0;
    }
    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }
    public String toString() {
        return name + " " + address + " " + number;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }
    public int getNumber() {
        return number;
    }
}

class Boo extends Aoo {
    private double salary; //Annual salary
    public Boo(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }
    public void mailCheck() {
        System.out.println("Within mailCheck of Boo class ");
        System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }
    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
}