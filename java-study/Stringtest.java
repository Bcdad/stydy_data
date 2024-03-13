public class Stringtest {
    public static void main(String[] argv) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HeLlo".toLowerCase();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        // 比较两个字符串应该用equals
        System.out.println(s1.equals(s3));
        System.out.println(s3.contains("ll"));
        // 格式化字符串
        // %s：显示字符串；
        // %d：显示整数；
        // %x：显示十六进制整数；
        // %f：显示浮点数。
        String s = "hello,%s and %s";
        System.out.println(s.formatted("xu", "zhao"));
        char[] cs = s1.toCharArray();
        String s4 = new String(cs);
        System.out.println(s4);
        System.out.println(cs);

    }
}
