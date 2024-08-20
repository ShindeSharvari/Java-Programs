class AirCondition 
{

	int systemId;
	String modelName;
	double minTemp;
	double maxTemp;
	double ambient;
	double price;
	int powerUsageWatts;
	
	public  void max() 
	{
		System.out.println("Max Temperature : "+maxTemp);
	}
	public  void min() 
	{
		System.out.println("Min Temperature : "+minTemp);
	}
	public  void ambient() 
	{
		System.out.println("Ambient Temperature : "+ambient);
	}
}
