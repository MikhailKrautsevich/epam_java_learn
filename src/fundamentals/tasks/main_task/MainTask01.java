package fundamentals.tasks.main_task;

// Task Main #1 :
// Приветствовать любого пользователя при вводе его имени через командную строку.

import java.util.Scanner;

public class MainTask01 {

    private static final String ENTER_YOUR_NAME = "Print your name, please.";
    private static final String STRING_TO_FORMAT = "Hello, %s.";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(ENTER_YOUR_NAME);
        String in = sc.nextLine();
        System.out.printf(STRING_TO_FORMAT, in);
    }
}
