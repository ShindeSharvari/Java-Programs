class NarrowingOfShort
{
  public static void main(String[]args)
  {
    short s=32765;

    byte b=(byte)s;
    System.out.println(b);

    char ch=(char)s;
    System.out.println(ch);

    int i=(int)s;
    System.out.println(i);

    long l=(long)s;
    System.out.println(l);

    float f=(float)s;
    System.out.println(f);

    double d=(double)s;
    System.out.println(d);
   
  }
}