package TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(", ");
        StringBuilder sb = new StringBuilder();

        for (String text : line) {
            if (text.length() >= 3 && text.length() <= 16) {
                for (int j = 0; j < text.length(); j++) {
                    char symbol = text.charAt(j);
                    if (Character.isAlphabetic(symbol) || Character.isDigit(symbol) || symbol == 45 || symbol == 95) {
                        sb.append(symbol);
                    } else {
                        break;
                    }
                    if (j == text.length() - 1) {
                        System.out.println(sb);
                    }
                }
                sb.setLength(0);
            }

        }


    }

}
