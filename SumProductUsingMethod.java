import java.util.Scanner;

class SumProductUsingMethod 
{
	public static void main(String[] args) 
	{
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num=sc.nextInt();

	  if(sum(num)==product(num))
	  {
		  System.out.println("Sum and product of entered number is same");
	  }
      else
	  {
		 System.out.println("Sum and product of entered number isnot same");
	  }
 
	}

	public static int sum(int num)
	{
		int sum1=0;
		for( ;num!=0;num/=10)
		{
			sum1=sum1+(num%10);
		}
		return sum1;
	}


	public static int product(int num)
	{
		int prod=1;
		for( ;num!=0;num/=10)
		{
			prod=prod*(num%10);
		}
		return prod;
	}
}
