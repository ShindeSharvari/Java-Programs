/*

		1   2   3   4   5   6   7   8
		9   10  11  12  13  14  15
		16  17  18  19  20  21
		22  23  24  25  26
		27  28  29  30
		31  32  33
		34  35
		36

*/

class Pattern27
{
	public static void main(String[] args) 
	{
		int n=8;
		int num=1;
		for (int i=0; i<n ;i++ )
		{
		    //for(int j=n ; j>i ; j--)
			for(int j=0 ; j<n-i ;j++)
			{
				System.out.print(num+"  ");
				num++;
			}
           System.out.println();
		}
	}
}