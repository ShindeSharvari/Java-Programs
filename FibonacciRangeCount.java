import java.util.Scanner;

class FibonacciRangeCount
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter starting number ");
	  int start = sc.nextInt();

      System.out.println("Enter end number ");
	  int end = sc.nextInt();

	  int n1=0,n2=1,n3;
	  int count=0;

	  for(int i=0;i<end;i++)
		{
		  n3=n1+n2;
		  if(n1>=start && n1<=end)
			{
			  count++;
			}
		  n1=n2;
		  n2=n3;
		}
		System.out.println("There are total "+count+" fibonacci numbers from "+start+" to "+end);
	}
}
