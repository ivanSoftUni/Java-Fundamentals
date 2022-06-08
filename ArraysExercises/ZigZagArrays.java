package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[line];
        int[] secondArray = new int[line];
        for (int i = 0; i < line; i++) {
            String[] arr = scanner.nextLine().split(" ");
            if (i % 2 == 0){
                firstArray[i] = Integer.parseInt(arr[1]);
                secondArray[i] = Integer.parseInt(arr[0]);
            }else {
                firstArray[i] = Integer.parseInt(arr[0]);
                secondArray[i] = Integer.parseInt(arr[1]);
            }
        }
        Arrays.stream(secondArray).forEach(e-> System.out.print(e + " "));
        System.out.println();
        Arrays.stream(firstArray).forEach(e -> System.out.print(e + " "));

    }
}
