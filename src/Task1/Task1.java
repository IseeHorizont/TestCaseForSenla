package Task1;

public class Task1 {

    // 1. Напишите программу, которая возвращает сумму цифр,
    // присутствующих в данной строке. Если цифр нет,
    // то возвращаемая сумма должна быть равна 0.

    public static void getSumOfNumberInString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println("Сумма цифр в строке = " + sum);
    }

    public static void main(String[] args) {
        getSumOfNumberInString("1ss1rr7");

        getSumOfNumberInString("simple string");

        getSumOfNumberInString("simple11string");
    }
}
