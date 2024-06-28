// Program to print LCM of entered three numbers

import java.util.Scanner;

public class LargestCommonMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter third number:");
        int num3 = scanner.nextInt();

        int lcm = num1;
        while (true) {
            if (lcm % num2 == 0 && lcm % num3 == 0)
           {
                break;
            }

            lcm = lcm + num1;
        }

        System.out.println("The LCM of " + num1 + ", " + num2 + " and " + num3 + " is :" + lcm);
    }
}