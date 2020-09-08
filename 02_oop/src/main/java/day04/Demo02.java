package day04;

public class Demo02 {
    public static void main(String args[]){
        Foo f = new Foo();
        f.eat();
        f.travel();
    }
}

interface Eoo {
    public void eat();
    public void travel();
}

class Foo implements Eoo {

    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }
}