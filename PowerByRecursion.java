class PowerByRecursion 
{
	public static void main(String[] args) 
	{
		System.out.println(power(2,3));
	}

	public static int power(int base,int raise)
	{
		if(raise!=0)
		{
			return base*power(base,(raise-1));
		}
		return 1;
	}
}
