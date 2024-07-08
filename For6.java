import java.util.Scanner;

public class For6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start character :");
		char start =  sc.next().charAt(0);

        System.out.print("Enter the end character :");
		char end = sc.next().charAt(0);

		for(char ch = start ; ch <= end ; ch+=2)
		{
		  System.out.println(ch);
		}
	}
}
