package fundamentals.arrays;

public class DeclaringArrays {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        int[] mas = new int[24];
        Integer mas2[] = new Integer[24];
//        char[] mas3 = new Character[] {'a', 'b', 'c'};
//        Item [] mas4 = new Item {new Item (), new Item ()};
        double[] mas5 = {5, 10, 15, 20};
        int[] mas6[] = new int[4][5];
        int mas7[][] = new int[5][];
    }

    private static void test2() {
        int a1[] = {};
        int a2[] = new int[]{1, 2, 3};
//        int a3[] = new int[] (1, 2, 3);
        int a4[] = new int[3];
//        int a5[] = new int[3] {1, 2, 3};
    }
}
