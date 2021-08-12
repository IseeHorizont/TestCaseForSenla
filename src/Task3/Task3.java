package Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task3 {

    // Создайте программу, которая будет вычислять и выводить на экран простые множители,
    // из которых состоит целое число, введенное пользователем. Если введенное число не целое,
    // то нужно сообщать пользователю об ошибке.

    public static void findSimpleNumbersOfNumber() {
        Scanner scanner = new Scanner(System.in);
        int userNumber = 0;
        while (userNumber <= 1 || userNumber % 1 != 0) {
            System.out.println("Введите целое число больше 1:");
            userNumber = scanner.nextInt();
            if (userNumber <= 1 || userNumber % 1 != 0) {
                System.out.println("Введено неверное число");
            }
        }

        ArrayList<Integer> simpleNumbersList = new ArrayList<>();
        for (int i = 0; i <= userNumber; i++) {
            if (isSimple(i)) {
                simpleNumbersList.add(i);
            }
        }
        Collections.sort(simpleNumbersList);
        StringBuilder sb = new StringBuilder();
        int i = 1;
        int copyUserNumber = userNumber;
        while (copyUserNumber != 1) {
            int multiplier = simpleNumbersList.get(i);
            if (copyUserNumber % multiplier == 0) {
                sb.append(multiplier + " ");
                copyUserNumber /= multiplier;
            } else {
                i++;
            }
        }
        System.out.println("Простые множители, из которых состоит число " + userNumber + " : " + sb);
    }

    public static boolean isSimple(int number) {
        if (number % 2 == 0) {
            return number == 2;
        }
        int i = 3;
        while (i * i <= number && number % i != 0) {
            i += 2;
        }
        return i * i > number;
    }

    public static void main(String[] args) {

        // 84 -> 2 2 3 7
        // 44 -> 2 2 11
        // 333 -> 3 3 37
        findSimpleNumbersOfNumber();
    }
}
