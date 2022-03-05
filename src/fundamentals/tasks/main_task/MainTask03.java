package fundamentals.tasks.main_task;

// Task Main #3 :
// Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.

import java.util.Random;
import java.util.Scanner;

public class MainTask03 {

    private static final String ENTER_NUMBER = "Enter number of random numbers you want.";
    public static final String INCORRECT_NUMBER_MESSAGE = "You entered incorrect number.";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = 0;

        System.out.println(ENTER_NUMBER);
        String entered = sc.nextLine();

        try {
            number = Integer.parseInt(entered);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (number >= 0) {
            if (number > 0) {
                for (int i = 0; i < number; i++) {
                    System.out.println(random.nextInt());
                }
                System.out.println("==========");
                for (int i = 0; i < number; i++) {
                    System.out.print(random.nextInt());
                    if (i < number - 1) {
                        System.out.print(' ');
                    }
                }
            }
        } else {
            System.out.println(INCORRECT_NUMBER_MESSAGE);
        }
    }
}
