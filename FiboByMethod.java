import java.util.Scanner;
class FiboByMethod 
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter number: ");
	  int num = sc.nextInt();

	  System.out.println("The "+num+ " fibonacci Series number is :"+nthFibo(num));

	}

	public static int nthFibo(int num)
	{
		int n1=0,n2=1,n3;
	    for(int i=0;i<num;i++)
		{
		  n3=n1+n2;
		  if(i==(num-1))
			{
             break;
			}
		  n1=n2;
		  n2=n3;	  
		}
		return n1;
	}
}
