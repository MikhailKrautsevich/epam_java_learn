package fundamentals;

public class DivisionByZero {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        double a, b, c, d, sum, sumBC, comAB;
        a = -3.0 / 0;
        b = 3.0 / 0;
        c = 0 / 4.0;
        d = 0 / 0.0;

        sum = a + b + c + d;
        sumBC = b + c;
        comAB = a * b;
        System.out.println(sum + " " + sumBC + " " + comAB);
    }
}
