import java.util.Scanner;

class BuzzByMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the number");
	    int num=sc.nextInt();

		if(check(num))
		{
			System.out.println(num+" is a buzz number");
		}
		else
		{
			System.out.println(num+" is not a buzz number");
		}
	}

	public static boolean check(int num)
	{
		return num%7==0 || num%10==7;
	}
}
