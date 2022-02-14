package fundamentals;

public class DataTypes {

    public static void main(String[] args) {
//        testDouble();
//        testInt();
//        testCompile();
//        test4();
        test5();
    }

    static void testDouble() {
        double d1 = 0.0f;
        Double d2 = new Double(.0f);
//    Double d3 = 0.0f;
//        Double d4 = new Double("1L");
        Double d5 = 0.d;
//    Double d6 = 1L;
    }

    static void testInt() {
        int i1 = Integer.parseInt("14");
        Integer i2 = 85;
//       Integer i3 = Integer.decode('12');
        Integer i4 = Integer.valueOf("21");
//        Integer i5 = Integer.valueOf(null);
        Integer i6 = new Integer("16");
    }

    static void testCompile(){
//        System.out.println(new Integer(null));
//        System.out.println(new String(null));
        System.out.println(new String("null"));
//        System.out.println((char[]) null);
        System.out.println((true?null:0));
        System.out.println((String)null);
    }

    static void test4(){
        Byte b = new Byte("3");
        System.out.println(b.floatValue() + " " + b.getClass().getName());
    }

    static void test5(){
        Double d = Double.POSITIVE_INFINITY;
        double d1 = d.intValue() + Double.NEGATIVE_INFINITY;
        System.out.println(d1);
    }
}
