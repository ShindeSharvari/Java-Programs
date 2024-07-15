/*  Pattern printing
A B C D
E F G H
I J K L
M N O P
*/

class PatternAlpa1 
{
	public static void main(String[] args) 
	{
		char ch='A';
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
