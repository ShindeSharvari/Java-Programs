/*

Tech Number
A number is called a tech number if the given number has an even number of digits and the number can be divided
exactly into two parts from the middle.
After equally dividing the number, sum up the numbers and find the square of the sum. 
If we get the number itself as square, the given number is a tech number, else, not a tech number.
For example, 3025 is a tech number.

*/
import java.util.Scanner;
class TechNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		int count=0;
		for(int i=num;i!=0;i/=10)
		{
           count++;
		}
		if(count%2==0)
		{
			int den=1;
			for(int i=0;i<count/2;i++)
			{
				den=den*10;
			}
			int last = num%den;
			int first = num/den;
			int sum = first + last;
			if((sum*sum)==num)
			{
				System.out.println(num+" is a tech number.");
			}
			else
			{
				System.out.println(num+" is not a tech number.");
			}
		}
		else
			{
				System.out.println(num+" is not a tech number.");
			}
	}
}
