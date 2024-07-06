// Print table by taking input from user using do while 

import java.util.Scanner;

class PrintTable1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to print table :");
		int multiplicand = sc.nextInt();
		int multiplier = 1;

		do
		{
			System.out.println(multiplicand+" * "+multiplier+" = "+(multiplier*multiplicand));
			multiplier++;
		}
		while (multiplier <= 10);

	}
}
