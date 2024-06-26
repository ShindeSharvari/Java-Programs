class IncrementDecrement1
{
  public static void main(String[] args)
  {

   int a=-3,b=8,c=a+b,d;

   d = -c++ + a--;
   a= a++;
   b= +a++ - --c;
   c= c--;

   System.out.println(a);

   System.out.println(b);

   System.out.println(c);

   System.out.println(d);


  }
}