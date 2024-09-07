class Parent
{
	Parent()
	{
		System.out.println("No argu parent const");
	}

	Parent(int a)
	{
		System.out.println("Parent 1 argu const");
	}

	Parent(int a, int b)
	{
		System.out.println("Parent 2 argu const");
	}
}

class Child extends Parent
{
	Child()
	{
		System.out.println("No argu child const");
	}

	Child(int a)
	{
		super(10,20);
		System.out.println("Child 1 argu const");
	}

}

class DriverExample
{
	public static void main(String[] args)
	{
		Child obj = new Child(10);
		Child obj1 = new Child();
	}
}