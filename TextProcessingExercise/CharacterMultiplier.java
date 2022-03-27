package TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        char[] array1 = input[0].toCharArray();
        char[] array2 = input[1].toCharArray();

        int smallerArray = Math.min(array1.length, array2.length);
        int biggerArray = Math.max(array1.length, array2.length);
        int sum = 0;
        for (int i = 0; i < biggerArray; i++) {
            if (i < smallerArray) {
                sum += array1[i] * array2[i];
            } else if (array1.length < array2.length) {
                sum += array2[i];
            } else {
                sum += array1[i];
            }
        }

        System.out.println(sum);

    }
}
