class Form 
{
	String name;
	long phno;
	String email;
	String dob;
	char gender;
	String loc;
	String education;
	String blood;
	String maritialStatus;
	long tel;
	long aadhar;
	String pan;

	Form()
	{
		System.out.println("Empty form created");
	}

	Form(String name,long phno,String email,String dob,char gender,String location,String edu)
	{
		this.name=name;
		this.phno=phno;
		this.email=email;
		this.dob=dob;
		this.gender=gender;
		loc=location;
		education=edu;

		System.out.println("Form Created");
	}
	Form(String name,long phno,String email,String dob,char gender,String location,String edu,String blood)
	{
		this.name=name;
		this.phno=phno;
		this.email=email;
		this.dob=dob;
		this.gender=gender;
		loc=location;
		education=edu;

		this.blood=blood;

		System.out.println("Form Created");
	}
	Form(String name,long phno,String email,String dob,char gender,String location,String edu,String blood,String maritialStatus)
	{
		this.name=name;
		this.phno=phno;
		this.email=email;
		this.dob=dob;
		this.gender=gender;
		loc=location;
		education=edu;

		this.blood=blood;
		this.maritialStatus=maritialStatus;

		System.out.println("Form Created");
	}
	Form(String name,long phno,String email,String dob,char gender,String location,String edu,String blood,String maritialStatus,long tel)
	{
		this.name=name;
		this.phno=phno;
		this.email=email;
		this.dob=dob;
		this.gender=gender;
		loc=location;
		education=edu;

		this.blood=blood;
		this.maritialStatus=maritialStatus;
		this.tel=tel;

		System.out.println("Form Created");
	}
	Form(String name,long phno,String email,String dob,char gender,String location,String edu,String blood,String maritialStatus,long tel,long aadhar)
	{
		this.name=name;
		this.phno=phno;
		this.email=email;
		this.dob=dob;
		this.gender=gender;
		loc=location;
		education=edu;

		this.blood=blood;
		this.maritialStatus=maritialStatus;
		this.tel=tel;
		this.aadhar=aadhar;

		System.out.println("Form Created");
	}

	Form(String name,long phno,String email,String dob,char gender,String location,String edu,String blood,String maritialStatus,long tel,long aadhar,String pan)
	{
		this.name=name;
		this.phno=phno;
		this.email=email;
		this.dob=dob;
		this.gender=gender;
		loc=location;
		education=edu;

		this.blood=blood;
		this.maritialStatus=maritialStatus;
		this.tel=tel;
		this.aadhar=aadhar;
		this.pan=pan;

		System.out.println("Form Created");
	}

	public void displayForm()
	{
		System.out.println("Name: "+name);
		System.out.println("Phone No: "+phno);
		System.out.println("Email: "+email);
		System.out.println("Date Of Birth: "+dob);
		System.out.println("Gender: "+gender);
		System.out.println("Location: "+loc);
		System.out.println("Education: "+education);
		System.out.println("Blood Group: "+blood);
		System.out.println("Maritial Status: "+maritialStatus);
		System.out.println("Telephone: "+tel);
		System.out.println("Aadhar: "+aadhar);
		System.out.println("------------------------------------");
	}


}