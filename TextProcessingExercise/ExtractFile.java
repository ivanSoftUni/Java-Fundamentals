package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split("\\\\");

        String[] newLine = line[line.length - 1].split("\\.");
        String name = newLine[0];
        String extension = newLine[1];
        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);
    }
}
