package TextProcessingExercise;

import java.util.List;
import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String > text = new java.util.ArrayList<>(List.of(scanner.nextLine().split("")));
        for (int i = 0; i < text.size() - 1; i++) {
            String currentSymbol = text.get(i);
            String nextSymbol = text.get(i + 1);
            if (currentSymbol.equals(nextSymbol)){
                text.remove(i);
                i--;
            }
        }
        for (String s : text) {
            System.out.print(s);
        }
    }
}
