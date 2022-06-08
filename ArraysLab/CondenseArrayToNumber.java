package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayNums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(value -> Integer.parseInt(value)).toArray();


       while (arrayNums.length > 1) {
           int[] newArray = new int[arrayNums.length - 1];
           for (int i = 0; i < arrayNums.length - 1; i++) {
               newArray[i] = arrayNums[i] + arrayNums[i + 1];
           }
            arrayNums = newArray;
       }
        System.out.println(arrayNums[0]);
    }
}
