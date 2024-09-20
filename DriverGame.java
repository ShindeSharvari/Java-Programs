class DriverGame 
{
	public static void main(String[] args) 
	{

        System.out.println();
        System.out.println("--------From Parent class--------");
        Game g3 = new Game();
		g3.goForward(5);
		g3.goBackward(7);
		g3.goLeft(10);
		g3.goRight(2);
        
        System.out.println();
        System.out.println("-----------From child class where methods get override--------------");
		Game2 g2 = new Game2();
		g2.goForward(5);
		g2.goBackward(7);
		g2.goLeft(10);
		g2.goRight(2);

        System.out.println();
        System.out.println("-----------Upcasting-----------------");
		Game g1 = new Game2();
		g1.goForward(5);
		g1.goBackward(7);
		g1.goLeft(10);
		g1.goRight(2); 

        
		

        
		
	}
}
