import java.util.Scanner;

class FibonacciCheck
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter number: ");
	  int num = sc.nextInt();
	  int n1=0,n2=1,n3;

	  for(int i=0; ;i++)
		{
		  n3=n1+n2;
		  System.out.println(n1);
		  if(n1==num)
			{
			  System.out.println("Entered number is fibonacci number ");
			  break;
			}
			else if(n1>num)
			{
              System.out.println("Entered number is not fibonacci number ");
			  break;
			}
		  n1=n2;
		  n2=n3;
		}
	}
}
