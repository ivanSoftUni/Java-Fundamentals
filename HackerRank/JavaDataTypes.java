package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaDataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String type = scanner.nextLine();
            Scanner input = new Scanner(type);
            if (input.hasNextByte()) {
                byte digit = Byte.parseByte(type);
                System.out.printf("%d can be fitted in:%n" +
                        "* byte%n" +
                        "* short%n" +
                        "* int%n" +
                        "* long%n", digit);
            } else if (input.hasNextShort()) {
                Short digit = Short.parseShort(type);
                System.out.printf("%d can be fitted in:%n" +
                        "* short%n" +
                        "* int%n" +
                        "* long%n", digit);
            } else if (input.hasNextInt()) {
                int digit = Integer.parseInt(type);
                System.out.printf("%d can be fitted in:%n" +
                        "* int%n" +
                        "* long%n", digit);
            } else if (input.hasNextLong()) {
                long digit = Long.parseLong(type);
                System.out.printf("%d can be fitted in:%n" +
                        "* long%n", digit);
            } else {
                BigInteger infinity = new BigInteger(type);
                System.out.printf("%d can't be fitted anywhere.%n", infinity);
            }
        }
    }
}
