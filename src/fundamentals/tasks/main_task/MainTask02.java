package fundamentals.tasks.main_task;

// Task Main #2 :
// Отобразить в окне консоли аргументы командной строки в обратном порядке.

import java.util.Scanner;

public class MainTask02 {

    private static final String ENTER_ARGS = "Enter arguments to revers it order.";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(ENTER_ARGS);
        String enteredArgs = sc.nextLine();
        String reversedArgs = reverseArgs(enteredArgs);
        System.out.println(reversedArgs);
    }

    private static String reverseArgs(String s) {
        String[] args = s.split(" ");
        StringBuilder toReturn = new StringBuilder();

        for (int i = args.length - 1; i >= 0; i--) {
            toReturn.append(args[i]).append(' ');
        }
        return toReturn.toString().trim();
    }
}
