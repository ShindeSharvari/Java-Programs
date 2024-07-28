// This will take even odd position from right left (front)

import java.util.Scanner;

class EvenOddPosition1
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the number : ");
	  int num = sc.nextInt();
	  int rem=0,rem1=0 ;
	  int count=0,even=0,product=1,rev=0;

	  
         while(num>0)
	 {
           rem=num%10;
           rev=(rev*10)+rem;
	   num=num/10;
	 }
	System.out.println(rev);
	while(rev>0)
	{
           rem1=rev%10;
	   count++;
	   if(count%2==0)
	   {
	     even=even+rem1;
	   }
	   else
	   {
	     product=product*rem1;
	   }
	   rev=rev/10;
	}
	System.out.println(even);
	System.out.println(product);
	}
}
