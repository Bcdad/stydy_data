public class easyclass {
    public static void main(String[] args) {
        Student Xiaoming = new Student();
        Xiaoming.setname("xiaoming");
        Xiaoming.setscore(12);
        System.out.println(Xiaoming.getscore());
        Xiaoming.setscore(10);
        System.out.println(Xiaoming.getscore());

    }
}

class Student {
    private String name;
    private int score;

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }

    public void setscore(int score) {
        this.score = score;
    }

    public int getscore() {
        return this.score;
    }
}