class Factorial 
{
	public static void main(String[] args) 
	{
		System.out.println(fact(4));
	}
	public static int fact(int n)
	{
		if(n!=0)
		{
			return n*fact(n-1);
		}
		return 1;
	}
}
