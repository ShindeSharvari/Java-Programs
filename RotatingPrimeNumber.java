/* Rotating prime - Check it entered number after rotation is also prime until rotateed number = number.

Enter the number to rotate : 1234
1234 is not a rotating prime number.

Enter the number to rotate : 113
113 is a rotating prime number.

*/

import java.util.Scanner;
class RotatingPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to rotate : ");
		int num=sc.nextInt();
	    
		int rot=num;
		for( ; ;)
		{
			int den=2;
			for( ;den<rot;den++)
			{
				if(rot%den==0)
				{
					break;
				}
			}
			if(rot==den)
			{
				int last=rot%10;
			    rot=rot/10;
			    int pow=1;
			    for(int temp=rot;temp!=0;temp/=10)
			    {
				    pow=pow*10;
			    }
                int ans = last*pow+rot;
			    rot=ans;
				if(num==rot)
				{
					break;
				}
			}
			else
			{
				rot/=10;         // Spoil the number
				break;
			}
	    }
        if(rot==num)
		{
			System.out.println(num+" is a rotating prime number.");
		}
		else
		{
			System.out.println(num+" is not a rotating prime number.");
		}
	}
}
