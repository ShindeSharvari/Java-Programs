class Smallest3
{
  public static void main(String [] args)
  {
    int n1=15,n2=115,n3=150;

    int Smallest=n1<n2 ? (n1<n3 ? n1:n3):(n2<n3 ? n2:n3);
    System.out.println("The Smallest among " +n1+ "," +n2+ ","+n3+" is: "+Smallest);
  }
}