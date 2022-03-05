package fundamentals.tasks.main_task;

// Task Main #4 :
// Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

import java.util.Scanner;

public class MainTask04 {

    private static final String ENTER_ARGS = "Enter args, please. All args must be integer.";
    private static final String SUM_IS = "Sum of args is %d.";
    private static final String MULT_IS = "\nResult of multiplication is %d.";
    private static final String INCORRECT_DATA_MESSAGE = "\nYou entered incorrect data.";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(ENTER_ARGS);
        boolean goodData = true;

        String enteredArgs = sc.nextLine();
        String[] stringArray = enteredArgs.split(" ");
        int[] parcedInts = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            try {
                parcedInts[i] = Integer.parseInt(stringArray[i]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                parcedInts[i] = 0;
                goodData = false;
            }
        }
        int sum = getSum(parcedInts);
        System.out.printf(SUM_IS, sum);
        if (goodData) {
            long mult = getMult(parcedInts);
            System.out.printf(MULT_IS, mult);
        } else {
            System.out.println(INCORRECT_DATA_MESSAGE);
        }
    }

    private static int getSum(int[] ints) {
        int sum = 0;
        for (int i : ints) {
            sum = sum + i;
        }
        return sum;
    }

    private static long getMult(int[] ints) {
        int mult = 1;
        for (int i : ints) {
            mult = mult * i;
        }
        return mult;
    }
}
