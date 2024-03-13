import java.util.Arrays;

public class list {
    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 7, 11, 14 };
        int[] d = new int[10];
        String[] c = new String[10];

        for (int i = 0; i < a.length - 1; i++) {
            for (int n = 0; n < a.length - i - 1; n++) {
                if (a[n] < a[n + 1]) {
                    int b = a[n];
                    a[n] = a[n + 1];
                    a[n + 1] = b;
                }
            }
        }

        System.out.print(Arrays.toString(a));
        Arrays.sort(a);
        System.out.print(Arrays.toString(a));
        // System.out.print(Arrays.toString(d));
        // System.out.print(Arrays.toString(c));
    }
}
