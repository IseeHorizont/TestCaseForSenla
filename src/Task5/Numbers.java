package Task5;

import java.util.ArrayList;

public class Numbers {
    public static ArrayList<char[][]> numbers = new ArrayList<>();

    public static void fillLineFromCharArray(int currentLine, StringBuilder line) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.get(i)[currentLine].length; j++) {
                line.append(numbers.get(i)[currentLine][j] + " ");
            }
            line.append("   ");
        }
    }

    public static void main(String[] args) {

        char[][] one = {
                {' ', ' ', '*'},
                {' ', ' ', '*'},
                {' ', '*', '*'},
                {' ', ' ', '*'},
                {' ', ' ', '*'},
                {' ', ' ', '*'}
        };

        char[][] two = {
                {'*', '*', '*'},
                {' ', ' ', '*'},
                {' ', '*', ' '},
                {'*', ' ', ' '},
                {'*', ' ', ' '},
                {'*', '*', '*'}
        };

        char[][] three = {
                {'*', '*', '*'},
                {' ', ' ', '*'},
                {'*', '*', '*'},
                {' ', ' ', '*'},
                {' ', ' ', '*'},
                {'*', '*', '*'}
        };

        char[][] four = {
                {'*', ' ', '*'},
                {'*', ' ', '*'},
                {'*', '*', '*'},
                {' ', ' ', '*'},
                {' ', ' ', '*'},
                {' ', ' ', '*'}
        };

        char[][] five = {
                {'*', '*', '*'},
                {'*', ' ', ' '},
                {'*', '*', '*'},
                {' ', ' ', '*'},
                {' ', ' ', '*'},
                {'*', '*', '*'}
        };

        char[][] six = {
                {'*', '*', '*'},
                {'*', ' ', ' '},
                {'*', '*', '*'},
                {'*', ' ', '*'},
                {'*', ' ', '*'},
                {'*', '*', '*'}
        };

        char[][] seven = {
                {'*', '*', '*'},
                {' ', ' ', '*'},
                {' ', ' ', '*'},
                {' ', ' ', '*'},
                {' ', ' ', '*'},
                {' ', ' ', '*'}
        };

        char[][] eight = {
                {'*', '*', '*'},
                {'*', ' ', '*'},
                {'*', '*', '*'},
                {'*', ' ', '*'},
                {'*', ' ', '*'},
                {'*', '*', '*'}
        };

        char[][] nine = {
                {'*', '*', '*'},
                {'*', ' ', '*'},
                {'*', '*', '*'},
                {' ', ' ', '*'},
                {' ', ' ', '*'},
                {'*', '*', '*'}
        };

        char[][] nought = {
                {'*', '*', '*'},
                {'*', ' ', '*'},
                {'*', ' ', '*'},
                {'*', ' ', '*'},
                {'*', ' ', '*'},
                {'*', '*', '*'}
        };

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case("1"):
                    numbers.add(one);
                    break;
                case("2"):
                    numbers.add(two);
                    break;
                case("3"):
                    numbers.add(three);
                    break;
                case("4"):
                    numbers.add(four);
                    break;
                case("5"):
                    numbers.add(five);
                    break;
                case("6"):
                    numbers.add(six);
                    break;
                case("7"):
                    numbers.add(seven);
                    break;
                case("8"):
                    numbers.add(eight);
                    break;
                case("9"):
                    numbers.add(nine);
                    break;
                case("0"):
                    numbers.add(nought);
                    break;
            }
        }

        StringBuilder firstLine = new StringBuilder();
        StringBuilder secondLine = new StringBuilder();
        StringBuilder thirdLine = new StringBuilder();
        StringBuilder fourLine = new StringBuilder();
        StringBuilder fiveLine = new StringBuilder();
        StringBuilder sixLine = new StringBuilder();

        fillLineFromCharArray(0, firstLine);
        fillLineFromCharArray(1, secondLine);
        fillLineFromCharArray(2, thirdLine);
        fillLineFromCharArray(3, fourLine);
        fillLineFromCharArray(4, fiveLine);
        fillLineFromCharArray(5, sixLine);

        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(thirdLine);
        System.out.println(fourLine);
        System.out.println(fiveLine);
        System.out.println(sixLine);
    }
}
