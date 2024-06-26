class IncrementDecrement
{
  public static void main(String[] args)
  {

   int a=5,b=7,c=3,d;

   d = b++ + ++c - a++;
   a= --d + b--;
   b= a+b - ++c;
   c= ++d - c++ + --b;

   System.out.println(a);

   System.out.println(b);

   System.out.println(c);

   System.out.println(d);


  }
}