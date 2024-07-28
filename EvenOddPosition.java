import java.util.Scanner;

class EvenOddPosition
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the number : ");
	  int num = sc.nextInt();
	  int count=0,evenSum=0,oddProduct=1;
      
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
			oddProduct=oddProduct*rem;
		  }
		   num=num/10;
		}
		System.out.println("The sum of even position numbers is : "+evenSum);
		System.out.println("The product of odd position number is : "+oddProduct);
	}
}
