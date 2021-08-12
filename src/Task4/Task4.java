package Task4;

import java.util.*;

public class Task4 {

    // Создайте программу, которая будет:
    // - подсчитывать количество гласных в словах
    // - выводить слова отсортированным списком по количеству гласных (сначала те, у которых больше гласных)
    // делать первую гласную букву в слове заглавной
    // Предложение вводится пользователем вручную русскими буквами. Разделитель пробел (“ ”).

    public static char[] tmp = {'а', 'А', 'е', 'Е', 'и', 'И', 'о', 'О', 'у',
            'У', 'э', 'Э', 'ю', 'Ю', 'я', 'Я', 'ы', 'Ы'};
    public static ArrayList<Character> vowels = new ArrayList<>();

    public static void workWithStrings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова русскими буквами в одну строку через пробел:");
        String input = scanner.nextLine();
        System.out.println("Всего количество гласных: " + calculateAmountVowels(input));

        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            int amountOfVowels = calculateAmountVowels(words[i]);
            words[i] = amountOfVowels + words[i];
        }
        System.out.println("Результат преобразования слов:");
        for (int i = words.length - 1; i > 0; i--) {
            for (int j = 0; j < words.length; j++) {
                if (words[j].contains(String.valueOf(i))) {
                    words[j] = getFirstVowelToUpperCase(words[j]);
                    System.out.println(words[j].substring(1));
                }
            }
        }
    }

    public static int calculateAmountVowels(String s) {
        for (int i = 0; i < tmp.length; i++) {
            vowels.add(tmp[i]);
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static String getFirstVowelToUpperCase(String string) {
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            char tmp = string.charAt(i);
            if (vowels.contains(tmp)) {
                char newChar = (char)((int)tmp - 32);
                string = string.replaceFirst(tmp + "",  newChar + "");
                return string;
            }
        }
        return string;
    }

    public static void main(String[] args) {
        workWithStrings();
    }
}
