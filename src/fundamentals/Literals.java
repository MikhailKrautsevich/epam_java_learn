package fundamentals;

public class Literals {
    public static void main(String[] args) {
        test1();
        test2();
        test4();
    }

    private static void test1() {
//        int var1 = 356f;
        double var2 = 356f;
        float var3 = 356f;
//        char var4 = 356f;
//        long var5 = 356f;
//        byte var6 = 356f;
//        Integer var7 = 356f;
//        Character var8 = 356f;
        Object var9 = 356f;
    }

    private static void test2() {
//        float f = 7.0;
//        char c = "z";
//        byte b = 255;
//        boolean n = null;
        int i = 32565;
        int j = 'ъ';
        System.out.println(j);
    }

    private static void test4() {
        Integer number = 32;
        // Binary number format
        String convert = Integer.toBinaryString(number);
        System.out.print(convert + " ");
        // Octagonal number format
        convert = Integer.toOctalString(number);
        System.out.print(convert + " ");
        // Hexadecimal number format
        convert = Integer.toHexString(number).toUpperCase();
        System.out.print(convert + " ");
    }
}
