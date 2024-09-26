public class Employee 
{
	String name;
	int id;
	double sal;
	int exp;
	String dept;
	String company;

	public String toString()
	{
		return "[Name: "+name+ " id: "+id+ " Salary: "+sal+ " Experience: "+exp+ " Department: "+dept+ " Company: "+company+" ]";
	}

	public Employee(String name, int id, double sal, int exp, String dept, String company)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
		this.exp=exp;
		this.dept=dept;
		this.company=company;
	}
}
