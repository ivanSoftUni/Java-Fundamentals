package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i <= array.length - 1; i++) {
            boolean isTop = false;
            int currentNum = array[i];
            if (i == array.length - 1){
                System.out.print(currentNum + " ");
                continue;
            }
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (currentNum > array[j]) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(currentNum + " ");
            }
        }
    }
}
