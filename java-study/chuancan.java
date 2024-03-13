public class chuancan {
    public static void main(String[] args) {
        String[] a = { "XU", "XIN" };
        Peo ben = new Peo("ben");
        ben.setNames(a);
        System.out.println(ben.getNames());
        System.out.println(ben.name);
        a[0] = "ben";
        System.out.println(ben.getNames());
        System.out.println(ben.name);
        Stu chen = new Stu(1, "chen");
        System.err.println(chen.score);
        System.err.println(chen.getUser());

    }
}

class Stu extends Peo {
    public int score;

    public Stu(int score, String name) {
        super(name);
        this.score = score;
    }

    @Override
    public String getUser() {
        return "hello" + this.name;
    }
}

class Peo {
    private String[] names;
    protected String name = "haha";

    // public Peo() {
    // }

    public Peo(String name) {
        this.name = name;
    }

    public void setNames(String[] names) {
        this.names = names;
        this.name = names[0];
    }

    public String getNames() {
        return this.names[0] + ' ' + this.names[1];

    }

    public String getUser() {
        return "hello";
    }
}
