package fundamentals.data_types;

public class Arithmetic {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test1() {
        int a = 129;
        byte b = 3;
        Object ab = (byte) a + b;
        System.out.println(ab.getClass().getName() + " value " + ab);
    }

    private static void test2() {
        long a = 2147483647000L;
        int b = 1;
        b += a;
        Object ab = b;
        System.out.println(ab.getClass().getName() + " value " + ab);
    }

    private static void test3() {
        char i = '1';
        Quest.result(i);
        System.out.println(i + " " + Quest.j);
    }

    static class Quest {
        static int j = 2;

        public static void result(int i) {
            i *= 10;
            j += 2;
        }
    }
}
