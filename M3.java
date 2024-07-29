class M3
{
	public static void main(String[] args) 
	{
		int a = 10;
		System.out.prinltn(a);

		test();
	}
	public static void test() 
	{
		System.out.println(a);      //CTE - The variable declared inside the block is local to method and we cant use it inside another method.
	}
}