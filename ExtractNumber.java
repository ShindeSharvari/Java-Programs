class ExtractNumber
{
	public static void main(String[] args) 
	{
		int num = 526734;

		while(num>0)
		{
			System.out.println(num%10);
			num=num/10;
		}
	}
}
