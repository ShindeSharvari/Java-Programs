import java.util.Scanner;

class DuckNumberByMethod 
{
	public static void main(String[] args) 
	{
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num=sc.nextInt();

	  if(check(num))
		{
		  System.out.println(num+ "is a Duck Number");
		}
	  else
		{
		  System.out.println(num+ "is not a Duck Number");
		}
	}

	public static boolean check(int num)
	{
		for( ;num!=0;num/=10)
		{
			if(num%10==0)
			{
			  return true;
			}
		}
		return false;
	}
}
