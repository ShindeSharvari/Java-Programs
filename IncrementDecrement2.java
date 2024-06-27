class IncrementDecrement2
{
  public static void main(String[] args)
  {

   int a=101,b=211;

   b= a++ - -b++ + ++a;

   System.out.println(b);

   a= b-- - --a - b--;


   System.out.println(a);

   System.out.println(b);

  }
}