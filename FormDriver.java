class FormDriver 
{
	public static void main(String[] args) 
	{
		Form f1 = new Form();
		f1.displayForm();

		Form f2 = new Form("Raju",9876543210l,"raju@rani.com","10/10/10",'M',"Pune","SSC");
		f2.displayForm();

		Form f3 = new Form("Sharyu",7020505683l,"shindesharvari@gmail.com","04/01/2001",'F',"Pune","MCA","O+","Unmarried",875868656l,989586558688965l,"ABCD234565");
		f3.displayForm();
	}
}


/*

Empty form created
Name: null
Phone No: 0
Email: null
Date Of Birth: null
Gender:
Location: null
Education: null
Blood Group: null
Maritial Status: null
Telephone: 0
Aadhar: 0
------------------------------------
Form Created
Name: Raju
Phone No: 9876543210
Email: raju@rani.com
Date Of Birth: 10/10/10
Gender: M
Location: Pune
Education: SSC
Blood Group: null
Maritial Status: null
Telephone: 0
Aadhar: 0
------------------------------------
Form Created
Name: Sharyu
Phone No: 7020505683
Email: shindesharvari@gmail.com
Date Of Birth: 04/01/2001
Gender: F
Location: Pune
Education: MCA
Blood Group: O+
Maritial Status: Unmarried
Telephone: 875868656
Aadhar: 989586558688965
------------------------------------

*/