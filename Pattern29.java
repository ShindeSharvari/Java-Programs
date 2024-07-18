/* 

		10  11  12  13                      14  15  16  17
		18          19                      20          21
		22          23                      24          25
		26  27  28  29  30  31  32  33  34  35  36  37  38
			    39                      40
			    41                      42
			    43                      44
		            45                      46
			    47                      48
		49  50  51  52  53  54  55  56  57  58  59  60  61
		62          63                      64          65
		66          67                      68          69
		70  71  72  73                      74  75  76  77

*/

class Pattern29
{
	public static void main(String[] args) 
	{
		int n=13;
		int num=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==n/4 || j==3*n/4 || j==n/4 || i==3*n/4 ||
				   j==0 && i<n/4  ||
				   i==0 && j<n/4 ||
				   i==0 && j>3*n/4 ||
				   j==n-1 && i<n/4 ||
				   i==n-1 && j>3*n/4 ||
				   j==n-1 && i>3*n/4 ||
				   i==n-1 && j<n/4 ||
				   j==0 && i>3*n/4 )
				{
				   System.out.print(num+"  ");
				   num++;
				} 
				
				else
				{
					System.out.print("  "+"  ");
				}
			}
			System.out.println();
		}
	}
}
