import java.util.Scanner;

class EvenOddPositionSum
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the number : ");
	  int num = sc.nextInt();
	  int count=0,evenSum=0,oddSum=0;
      
	  while(num>0)
		{
           int rem=num%10;
		   count++;
		   if(count%2==0)
			{
			   evenSum=evenSum+rem;
			}
			else
			{
			  oddSum=oddSum+rem;
			}
		   num=num/10;
		}
		if(evenSum==oddSum)
		{
          System.out.println("The sum of even and odd position numbers are equal");
		}
		else
		{
          System.out.println("The sum of even and odd position numbers are not equal");
		}
	}
}
