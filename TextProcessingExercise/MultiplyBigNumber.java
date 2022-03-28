package TextProcessingExercise;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] numbers = scanner.nextLine().toCharArray();
        int multiply = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();
        int remainder = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            char c = numbers[i];
            int digit = Integer.parseInt(c + "");
            int result = digit * multiply + remainder;

            if (i == 0) {
                sb.insert(0, result);
            } else {
                int digitToAdd = result % 10;
                remainder = result / 10;
                sb.insert(0, digitToAdd);
            }
        }
        while (sb.charAt(0) == '0' && sb.length() > 1) {
            sb.deleteCharAt(0);
        }
        System.out.println(sb);
    }
}
