import java.util.Scanner;
import java.util.Random;

public class Demo {
    public static void main(String[] argv) {
        try (var scanner = new Scanner(System.in)) {
            String[] sult = new String[] { "石头", "剪刀", "布" };
            var rand = new Random();
            System.out.println("请输入你的选择");
            String choice = scanner.nextLine().trim();
            System.out.println(choice);
            String com = sult[rand.nextInt(3)];
            switch (choice) {
                case "石头" -> {
                    if (com == "石头") {
                        System.out.println("平局，电脑的选择是" + com);
                    } else if (com == "剪刀") {
                        System.out.println("你赢了，电脑的选择是" + com);

                    } else {
                        System.out.println("你输了，电脑的选择是" + com);
                    }
                }
                case "剪刀" -> {
                    if (com == "石头") {
                        System.out.println("你输了，电脑的选择是" + com);
                    } else if (com == "剪刀") {
                        System.out.println("平局，电脑的选择是" + com);

                    } else {
                        System.out.println("你赢了，电脑的选择是" + com);
                    }
                }
                case "布" -> {
                    if (com == "石头") {
                        System.out.println("你赢了，电脑的选择是" + com);
                    } else if (com == "剪刀") {
                        System.out.println("你输了，电脑的选择是" + com);

                    } else {
                        System.out.println("平局，电脑的选择是" + com);
                    }
                }
                default -> System.out.println(choice);

            }
        }

    }
}
