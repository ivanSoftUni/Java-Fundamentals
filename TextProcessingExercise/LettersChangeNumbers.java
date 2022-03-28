package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("\\s+");
        double sum = 0;

        for (String s : text) {
            char letterBefore = s.charAt(0);
            char letterAfter = s.charAt(s.length() - 1);
            String digit = s.substring(1, s.length() - 1);
            double number = Double.parseDouble(digit);
            char beforePosition = s.toLowerCase().charAt(0);
            char afterPosition = s.toLowerCase().charAt(s.length() - 1);
            if (Character.isUpperCase(letterBefore)) {
                sum += number / getLetterPosition(beforePosition);
            } else {
                sum += number * getLetterPosition(beforePosition);
            }
            if (Character.isUpperCase(letterAfter)) {
                sum -= getLetterPosition(afterPosition);
            } else {
                sum += getLetterPosition(afterPosition);
            }
        }
        System.out.printf("%.2f", sum);

    }

    private static double getLetterPosition(char c) {

        return c - 96;
    }
}
