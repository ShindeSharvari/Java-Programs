class M4 
{
	public static void main(String[] args) 
	{
		System.out.println("Main begins");
		test();
		System.out.println("Main ends");
	}

	public static void test()
	{
		System.out.println("From test() method");
		demo();
		System.out.println("test() method ends");
	}

	public static void demo()
	{
		System.out.println("demo() method");
	}
}
