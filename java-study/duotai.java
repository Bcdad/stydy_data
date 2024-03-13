public class duotai {
    public static void main(String[] args) {
        Per a = new Student();
        a.run();
        // Student b = new Per();
        // b.run();

    }
}

abstract class Per {
    // public void run() {
    // System.out.println("Peo run");
    // }
    public abstract void run();      //抽象类可以强制子类实现其定义的方法，不然报错
}

class Student extends Per {
    // @Override
    public void run() {
        System.out.println("Student run");
    }
}