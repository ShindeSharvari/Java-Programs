class NarrowingOfLong
{
  public static void main(String[]args)
  {
    long l= 32770l;

    byte b=(byte)l;
    System.out.println(b);

    char ch=(char)l;
    System.out.println(ch);

    short s=(short)l;
    System.out.println(s);

    int i=(int)l;
    System.out.println(i);

    float f=(float)l;
    System.out.println(f);

    double d=(double)l;
    System.out.println(d);
   
  }
}