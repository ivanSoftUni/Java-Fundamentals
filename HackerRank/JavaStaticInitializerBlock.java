package HackerRank;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int B = Integer.parseInt(scanner.nextLine());
        int H = Integer.parseInt(scanner.nextLine());

        if (B>=0 && H>=0){
            int field = B * H;
            System.out.println(field);
        }else {
            System.out.printf("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
