import java.util.Scanner;
class TrafficLight
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a color :");
	   String color = sc.next();

	   switch(color.toLowerCase())
		{
		   case "red":
			{
			   System.out.println("Stop");
			   break;
			}

			case "yellow":
			{
			   System.out.println("Get ready");
			   break;
			}

			case "green":
			{
			   System.out.println("Go");
			   break;
			}

			default :
			{
				System.out.println("Invalid traffic signal color");
			}
		}
	}
}
