package homeWork4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("Enter correct password");
        Scanner scan = new Scanner(System.in);

        int password;
        int correctPass = 22334455;
        do {
            password = scan.nextInt();
            if (password == correctPass) {
                break;
            } else {
                System.out.println("Enter correct password");
            }
        } while (password != correctPass);
    }
}