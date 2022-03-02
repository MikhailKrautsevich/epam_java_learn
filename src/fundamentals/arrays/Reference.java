package fundamentals.arrays;

public class Reference {

    public static void main(String[] args) {
        int[] arr = {2, 5, 7};
        new Example(arr);
    }
}


class Example {
    static int[] arr;

    static {
        int val = arr[0];
    }

    public Example(int[] arrMain) {
        this.arr = arrMain;
    }
}
