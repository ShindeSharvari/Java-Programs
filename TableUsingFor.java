import java.util.Scanner;

public class TableUsingFor
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int multiplicand = sc.nextInt();
		int multiplier = 1;

		for(int num=multiplicand ; 10 >=  multiplier ; multiplier++)
		{
		  System.out.println(multiplicand+" * "+multiplier+" = "+(multiplicand*multiplier));
		}
	}
}
