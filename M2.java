class M2
{
	public static void main(String[] args) 
	{
		bheem();
		bheem();               // order of calling depends on programmer
		bheem();
		chutki();
	}
	public static void chutki() 
	{
		System.out.println("Get lost !");
	}
	public static void bheem() 
	{
		System.out.println("Hi ! chutki jevlis ka ?");
	}
}