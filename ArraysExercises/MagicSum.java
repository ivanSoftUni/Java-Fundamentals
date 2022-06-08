package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(value -> Integer.parseInt(value)).toArray();
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= array.length -2 ; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int currentSum = array[i] + array[j];
                if (num == currentSum){
                    System.out.println(array[i] + " " + array[j]);
                }
            }

        }



    }
}
