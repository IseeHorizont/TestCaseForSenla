package Task5;

import java.util.Scanner;

public class Task5 {

    // Создайте программу, которая будет получать число и печатать его в следующем формате
    // (формы цифр можно придумать свои, главное, чтобы они читались на экране):
    // (*) Дополнительно: сделайте так, чтобы наибольшая цифра состояла не из ‘*’,
    // а из соответствующих маленьких (обычных) цифр.



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        String[] arrayOfUserNumbers = scanner.nextLine().split("");

        Numbers.main(arrayOfUserNumbers);

//        for (int i = 0; i < arrayOfUserNumbers.length; i++) {
//            System.out.print(arrayOfUserNumbers[i] + " ");
//        }

    }
}
