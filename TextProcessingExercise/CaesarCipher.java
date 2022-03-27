package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] text = scanner.nextLine().toCharArray();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < text.length; i++) {
            char currentSymbol = (char) (text[i] + 3);
            stringBuilder.append(currentSymbol);
        }
        System.out.println(stringBuilder);
    }
}
