package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        boolean isEqual = false;
        for (int i = 0; i <= arr.length - 1; i++) {
            int leftSum = 0;
            int rightSum = 0;
            int index = i;
            for (int leftSide = 0; leftSide < i; leftSide++) {
                leftSum += arr[leftSide];
            }

            for (int rightSide = i + 1; rightSide < arr.length; rightSide++) {
                rightSum += arr[rightSide];
            }

            if (leftSum == rightSum) {
                isEqual = true;
                System.out.println(index);
                break;
            }
        }
        if (!isEqual) {
            System.out.printf("no");
        }
    }
}
