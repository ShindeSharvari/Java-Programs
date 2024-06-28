// Program to print sum of the entered digit eg: input:121 , output :4

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        int sum = 0;

        while (num!= 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        System.out.println("The sum of the digits is : " + sum);
    }
}