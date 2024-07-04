import java.util.Scanner;
class HotelMenu 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome To Shinde Hotel");
		System.out.println("-----------Menu-----------");
		System.out.println("what you prefer veg / non veg");
		String choose = s.nextLine();
		
		switch(choose.toLowerCase())
		{
			case "veg" :
			{ 
				System.out.println("----------Veg Menu-----------");
				System.out.println("Poha - Rs. 30");
                System.out.println("Upma - Rs. 40");
                System.out.println("Sada Dosa - Rs. 50");
                System.out.println("Masala Dosa - Rs. 60");
                System.out.println("Medu vada - Rs. 45");
                System.out.println("Dahi vada - Rs. 55");
                System.out.println("Vada Pav - Rs. 35");
                System.out.println("Bread Pakora - Rs. 40");
                System.out.println("Sandwich - Rs. 50");

				System.out.println("");
				System.out.println("What would you like to order ?");
				String veg = s.nextLine();

				switch(veg.toLowerCase())
				{
				   case "poha":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Poha");
                        System.out.println("Bill: Rs." + (plates * 30));
                        break;
					 }
                    case "upma":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Upma");
                        System.out.println("Bill: Rs." + (plates * 40));
                        break;
					 }
                    case "sada dosa":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Sada Dosa");
                        System.out.println("Bill: Rs." + (plates * 50));
                        break;
					 }
                    case "masala dosa":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Masala Dosa");
                        System.out.println("Bill: Rs." + (plates * 60));
                        break;
					 }
                    case "medu vada":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Medu Vada");
                        System.out.println("Bill: Rs." + (plates * 45));
                        break;
					 }
                    case "dahi vada":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Dahi Vada");
                        System.out.println("Bill: Rs." + (plates * 55));
                        break;
					 }
                    case "vada pav":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Vada Pav");
                        System.out.println("Bill: Rs." + (plates * 35));
                        break;
					 }
                    case "bread pakora":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Bread Pakora");
                        System.out.println("Bill: Rs." + (plates * 40));
                        break;
					 }
                    case "sandwich":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Sandwich");
                        System.out.println("Bill: Rs." + (plates * 50));
                        break;
					 }
					 default :
					  {
						 System.out.println("Sorry we dont have that in menu");
					  }

            }
				break ;
		}

			case "non veg" :
			{
				System.out.println("----------Non-Veg Menu-----------");
				System.out.println("Boiled Eggs - Rs. 60");
                System.out.println("Omelette - Rs. 70");
                System.out.println("Chicken Soup - Rs. 80");
                System.out.println("Grilled Chicken - Rs. 120");
                System.out.println("Shrimp Salad - Rs. 150");
                System.out.println("Chicken 65 - Rs. 100");
                System.out.println("Fish Fry - Rs. 130");
                System.out.println("Chicken momos - Rs. 90");
                System.out.println("Butter Chicken - Rs. 140");

				System.out.println("");
				System.out.println("What would you like to order ?");
				String veg = s.nextLine();

				switch(veg.toLowerCase())
				{
				   case "boiled eggs":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Boiled Eggs");
                        System.out.println("Bill: Rs." + (plates * 60));
                        break;
					 }
                    case "omelette":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Omelette");
                        System.out.println("Bill: Rs." + (plates * 70));
                        break;
					 }
                    case "chicken soup":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Chicken Soup");
                        System.out.println("Bill: Rs." + (plates * 80));
                        break;
					 }
                    case "grilled chicken":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Grilled Chicken");
                        System.out.println("Bill: Rs." + (plates * 120));
                        break;
					 }
                    case "shrimp salad":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Shrimp Salad");
                        System.out.println("Bill: Rs." + (plates * 150));
                        break;
					 }
                    case "chicken 65":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Chicken 65");
                        System.out.println("Bill: Rs." + (plates * 100));
                        break;
					 }
                    case "fish fry":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Fish Fry");
                        System.out.println("Bill: Rs." + (plates * 130));
                        break;
					 }
                    case "chicken momos":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Chicken Momos");
                        System.out.println("Bill: Rs." + (plates * 90));
                        break;
					 }
                    case "butter chicken":
					 {
                        System.out.println("How many plates? ");
                        int plates = s.nextInt();
						System.out.println("-----***BILL***-----");
                        System.out.println("You have ordered " + plates + " plates of Butter Chicken");
                        System.out.println("Bill: Rs." + (plates * 140));
                        break;
					 }
					 default :
					  {
						 System.out.println("Sorry we dont have that in menu");
					  }
                }
				break ;
			}

			default :
			{
				System.out.println("Sorry plz choose veg / non veg ");
			}
		}
	}
}
