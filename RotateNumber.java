/*

Enter the number
1234
4123

*/

import java.util.Scanner;
class RotateNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

        System.out.println(rotate(num));
	}

	public static int rotate(int num)
	{
		int last = num%10;
		num/=10;
		int ans = last * power(10,count(num))+num;
		return ans;

    //  return(num%10)* power(10,count(num)-1)+num/10;
	}
    
	public static int count(int num)
	{
		int ct = 0;
		for( ;num!=0;num/=10)
		{
			ct++;
		}
		return ct;
	}

	public static int power(int base , int raise)
	{
		int pow = 1;
		for(int i=0;i<raise;i++)
		{
			pow *=base;
		}
		return pow;
	}
}
