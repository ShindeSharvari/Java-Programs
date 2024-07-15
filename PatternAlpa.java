/* Pattern printing altarnate
      A C E G
      I K M O
      Q S U W
      Y A C E
*/
class PatternAlpa 
{
	public static void main(String[] args) 
	{
		char ch='A';
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(ch+" ");
				ch+=2;
				if(ch>'Z')
				{
					ch='A';
				}
			}
			System.out.println();
		}
	}
}
