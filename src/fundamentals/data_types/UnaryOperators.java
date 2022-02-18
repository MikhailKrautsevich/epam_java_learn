package fundamentals.data_types;

public class UnaryOperators {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        long a = Long.remainderUnsigned(-2, 3);
        int b = Integer.remainderUnsigned(-2, 3);
        int c = -2 % 3;
        System.out.println(a + " " + b + " " + c);
    }
}
