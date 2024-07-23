/*

Enter the starting number:1
Enter the ending number:1000
1
2
145

*/

import java.util.Scanner;
class StrongNumberInRange
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the starting number:");
		long start=sc.nextLong();
   
        System.out.print("Enter the ending number:");
		long end=sc.nextLong();
		
		while(start<=end)
		{
		  long sum=0;
          long num=start;
		  while(num!=0)
		  {
			
		    long rem=num%10;
			long fact=1;
			for(long i =rem;i>0;i--)
			{
				fact=fact*i;
			}
			sum+=fact;
			num/=10;
		  }
		 if(start==sum)
		 {
		 	System.out.println(start);
		 }
		start++;
	   }
	}
}