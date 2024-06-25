class Large2
{
  public static void main(String [] args)
  {
    int n1=15,n2=115,n3=150;

    int largest=n1>n2 ? (n1>n3 ? n1:n3):(n2>n3 ? n2:n3);
    System.out.println("The largest among " +n1+ "," +n2+ ","+n3+" is: "+largest);
  }
}