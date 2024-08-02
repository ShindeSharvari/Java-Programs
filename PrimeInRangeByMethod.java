import java.util.Scanner;
class PrimeInRangeByMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number ");
		int start = sc.nextInt();

        System.out.println("Enter the end number ");
		int end = sc.nextInt();

        System.out.println("Prime numbers between "+start+" and "+end+" are");
		primeRange(start,end);
	}

	public static void primeRange(int start , int end)
	{
		while(start<=end)
		{
			if(checkPrime(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}

	public static boolean checkPrime(int start)
	{
		int den=2;
		for(;den<start;den++)
		{
			if(start%den==0)
			{
				return false;
			}
		}
		return true;
	}
}