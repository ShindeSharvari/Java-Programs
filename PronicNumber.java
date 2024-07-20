/*

A Pronic number, also known as a heteromecic number or oblong number, 
is a number that is the product of two consecutive integers, i.e., a number of the form n*(n+1).

In other words, a pronic number is a number that can be expressed as the product of two consecutive integers, such as:

2 = 1 × 2
6 = 2 × 3
12 = 3 × 4
20 = 4 × 5
30 = 5 × 6
...
The sequence of pronic numbers is: 2, 6, 12, 20, 30, 42, 56, 72, 90, ...

*/

import java.util.Scanner;
 
class PronicNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
                int i=0;
                while(num>=i)
		{
		   if(i*(i+1)==num)
		   {
			  break;
		   }
			i++;
		}
		if(i*(i+1)==num)
		{
			System.out.println(+num+" is a pronic number");
		}
		 else
		{
                        System.out.println(+num+" is not a pronic number");
		}
	}
}
