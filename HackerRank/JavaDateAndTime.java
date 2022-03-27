package HackerRank;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();



     String dt = LocalDate.of(year, month, day).getDayOfWeek().name();
        System.out.println(dt);
    }
}
