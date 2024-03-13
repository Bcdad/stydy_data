public class enumtest {
    public static void main(String[] angr) {
        Week day = Week.Sun;
        System.out.println(day == Week.Sun);
        // System.out.println("3" < "4");

    }
}

enum Week {
    Sun, Mon, TUE, WED, THU, FRI, SAT;
}
