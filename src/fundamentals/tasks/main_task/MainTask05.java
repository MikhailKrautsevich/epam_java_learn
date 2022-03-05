package fundamentals.tasks.main_task;

// Task Main #5 :
// Ввести число от 1 до 12.
// Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.

import java.util.Scanner;

public class MainTask05 {

    private static final String PLEASE_ENTER = "Please enter number of month.";
    private static final String CORRECT_DATA_MESSAGE = "The month is %s.";
    private static final String INCORRECT_DATA_MESSAGE = "You entered incorrect data";
    private static final String SMTH_WRONG = "NOT_EXISTING MONTH";

    private static final String JANUARY = "JANUARY";
    private static final String FEBRUARY = "FEBRUARY";
    private static final String MARCH = "MARCH";

    private static final String APRIL = "APRIL";
    private static final String MAY = "MAY";
    private static final String JUNE = "JUNE";

    private static final String JULY = "JULY ";
    private static final String AUGUST = "AUGUST";
    private static final String SEPTEMBER = "SEPTEMBER";

    private static final String OCTOBER = "OCTOBER";
    private static final String NOVEMBER = "NOVEMBER ";
    private static final String DECEMBER = "DECEMBER";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(PLEASE_ENTER);
        String entered = sc.nextLine();
        int number = -1;

        try {
            number = Integer.parseInt(entered);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        if (number > 0 && number < 13) {
            String month = chooseMonth(number);
            System.out.printf(CORRECT_DATA_MESSAGE, month);
        } else System.out.println(INCORRECT_DATA_MESSAGE);
    }

    private static String chooseMonth(int number) {
        switch (number) {
            case 1:
                return JANUARY;
            case 2:
                return FEBRUARY;
            case 3:
                return MARCH;
            case 4:
                return APRIL;
            case 5:
                return MAY;
            case 6:
                return JUNE;
            case 7:
                return JULY;
            case 8:
                return AUGUST;
            case 9:
                return SEPTEMBER;
            case 10:
                return OCTOBER;
            case 11:
                return NOVEMBER;
            case 12:
                return DECEMBER;
            default:
                return SMTH_WRONG;
        }
    }

}
