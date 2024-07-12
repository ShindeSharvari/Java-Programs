import java.util.Scanner;

class FibonacciLast
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter number: ");
	  int num = sc.nextInt();
	  int n1=0,n2=1,n3;
      System.out.println("Fibonacci series");
	  for(int i=0;i<num;i++)
		{
		  n3=n1+n2;
		  System.out.println(n1);
		  if(i==(num-1))
			{
             System.out.println("The "+num+ " number fibonacci Series is :"+n1);
			}
		  n1=n2;
		  n2=n3;
			  
		}
	}
}
