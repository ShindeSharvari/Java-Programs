/* Rotate the number as per user entered no of times rotation.

Enter the number to rotate : 1234
Enter the number of rotations : 3
4123
3412
2341

*/

import java.util.Scanner;
class RotateNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to rotate : ");
		int num=sc.nextInt();

		System.out.print("Enter the number of rotations : ");
		int no=sc.nextInt();

		for(int i=0;i<no;i++)
		{
            int last=num%10;
			num=num/10;
			int pow=1;
			for(int temp=num;temp!=0;temp/=10)
			{
				pow=pow*10;
			}
            int ans = last*pow+num;
			System.out.println(ans);
			num=ans;
		}
	}
}
