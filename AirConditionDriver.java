class AirConditionDriver 
{
	public static void main(String[] args) 
	{
		AirCondition a1 = new AirCondition();
		a1.systemId = 2876464;
	    a1.modelName = "CoolMaster";
	    a1.minTemp = -10.0;
	    a1.maxTemp= 45.0 ;
	    a1.ambient = 22.0;
	    a1.price = 1500.0;
	    a1.powerUsageWatts = 2200;

		a1.max();
		a1.min();
		a1.ambient();	
	}
}
