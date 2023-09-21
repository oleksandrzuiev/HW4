package homeWork4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        double a, sum = 0;
        do {
            a = scan.nextDouble();
            sum += a;
        } while (a != 0);

        System.out.println("Sum = " + sum);
    }
}
