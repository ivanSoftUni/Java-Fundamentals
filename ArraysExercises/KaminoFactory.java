package ArraysExercises;


import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int[] bestSequence = new int[length];
        int index = -1;
        int count = 0;
        int printCount = 0;
        int printIndex = 100;
        int bestSequenceSum = 0;
        int sequenceSum = 0;
        while (!input.equals("Clone them!")) {
            String[] numberString = input.split("\\!");
            sequenceSum = 0;
            int[] array = Arrays.stream(numberString)
                    .mapToInt(value -> Integer.parseInt(value)).toArray();
                count++;
            for (int i = 0; i < array.length ; i++) {
                if (array[i] == 1 && array[i + 1] == 1) {
                    index = i;
                }
                sequenceSum += array[i];
            }
            if (sequenceSum > bestSequenceSum) {
                bestSequenceSum = sequenceSum;
                bestSequence = array;
                printCount = count;
            }
            if (index < printIndex) {
                printIndex = index;
            }
            input = scanner.nextLine();
        }
        if (index < printIndex) {
            System.out.printf("Best DNA sample %d with sum: %d.%n", count, bestSequenceSum);
            for (int i = 0; i < bestSequence.length; i++) {
                System.out.print(bestSequence[i] + " ");
            }
        }else{
                System.out.printf("Best DNA sample %d with sum: %d.%n", printCount, bestSequenceSum);
                for (int i = 0; i < bestSequence.length; i++) {
                    System.out.print(bestSequence[i] + " ");
                }

            }
        }
    }



