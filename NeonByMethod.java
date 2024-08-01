import java.util.Scanner;

class NeonByMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the number");
	    int num=sc.nextInt();
  
		if(findSquare(num)==num)   // the returned sum from sum method is returned to findSquare and used here to compare.
		{
			System.out.println("Neon number.");
		}
		else
		{
			System.out.println("not Neon number.");
		}

	}

	public static int findSquare(int num)
	{ 
		int square = num * num;
	    return sum(square);      // obtained square is given to sum ethod and it will return sum to this method only
	}

	public static int sum(int square)
	{
        int sum=0;
		while(square>0)
		{
			sum=sum+(square%10);
			square/=10;
		}
		return sum;
	}
}
