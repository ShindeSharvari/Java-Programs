class Largest4
{
  public static void main(String [] args)
  {
    int n1=15,n2=115,n3=150,n4=398;

    int largest=n1>n2 ? (n1>n3 ? (n1>n4 ? n1:n4):(n3>n4 ? n3:n4)):(n2>n3 ? (n2>n4 ? n2:n4):(n3>n4 ? n3:n4));
   System.out.println("The largest among " +n1+ "," +n2+ ","+n3+ ","+n4+" is: "+largest);
  }
}
 

