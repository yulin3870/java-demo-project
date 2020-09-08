package day02;

public class Demo01 {
    private static int numInstances = 0;

    Demo01() {
        Demo01.addInstance();
    }

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    public static void main(String[] arguments) {
        System.out.println("Starting with " + Demo01.getCount() + " instances");
        for (int i = 0; i < 500; ++i) {
            new Demo01();
        }
        System.out.println("Created " + Demo01.getCount() + " instances");
    }
}
