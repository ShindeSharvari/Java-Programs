class NarrowingOfFloat
{
  public static void main(String[]args)
  {
    float f= 123.23f;

    byte b=(byte)f;
    System.out.println(b);

    char ch=(char)f;
    System.out.println(ch);

    short s=(short)f;
    System.out.println(s);

    int i=(int)f;
    System.out.println(i);

    long l=(long)f;
    System.out.println(l);

    double d=(double)f;
    System.out.println(d);
   
  }
}