package day03;

public class Demo05 {
    public static void main(String [] args) {
        Doo d = new Doo("Mohd",3600.00);
        System.out.println("salary："  + d.computePay());
    }
}

abstract class Coo {
    private String name;
    public Coo(String name){
        this.name = name;
    }

    public abstract double computePay();

    public String getName() {
        return name;
    }
}

class Doo extends Coo {

    public Doo(String name, double salary){
        super(name);
        setSalary(salary);
    }
    private double salary;

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