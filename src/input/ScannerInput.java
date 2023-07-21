package input;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        System.out.println("Enter: ");

        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            System.out.println(num);
        }
    }
}
