/*  Pattern printing alternate number
    1  3  5  7
	9  11  13  15
	17  19  21  23
	25  27  29  31
*/

class PatternNumAlternate
{
	public static void main(String[] args) 
	{
		int n=1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(n+"  ");
				n+=2;
			}
			System.out.println();
		}
	}
}
