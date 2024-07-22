import java.util.Scanner;

class FiboPrimePrint
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter starting number ");
	  int start = sc.nextInt();

      System.out.println("Enter end number ");
	  int end = sc.nextInt();

	  int n1=0,n2=1,n3;

	  for(int i=0;i<end;i++)
		{
		  n3=n1+n2;
		  if(n1>=start && n1<=end)
			{
			  int divisor=2;
		      for(;divisor<=n1;divisor++)
		      {
			     if(n1%divisor==0)
			     {
				   break;
			     }
		      }
		if(n1==divisor)
		{
			System.out.println(n1);
		}
			}
		  n1=n2;
		  n2=n3;
		}
	}
}
