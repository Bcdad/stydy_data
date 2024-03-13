public class supertest {
    public static void main(String[] argv) {
        Student xiaoming = new Student("xiaoming", 20, 18);
        System.out.println(xiaoming.score);

    }
}

class Peo {
    public String name;
    public int age;

    public Peo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Peo() {

    }
}

class Student extends Peo {
    public int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getscore() {
        return this.score;
    }
}