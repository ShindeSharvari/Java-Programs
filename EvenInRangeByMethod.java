import java.util.Scanner;
class EvenInRangeByMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number ");
		int start = sc.nextInt();

        System.out.println("Enter the end number ");
		int end = sc.nextInt();

        System.out.println("Even numbers between "+start+" and "+end+" are");
		evenRange(start,end);
	}

	public static void evenRange(int start , int end)
	{
		while(start<=end)
		{
			if(checkEven(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}
	public static boolean checkEven(int num)
	{
		return num%2==0;
	}
}
