public class lianshidiaoyong {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.num);
        adder.add()
                .add()
                .add();
        System.out.println(adder.num);
    }
}

class Adder {
    int num = 0;

    public Adder add() {
        num = num + 1;
        return this;
    }
}
