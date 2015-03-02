package arrays;
class factorial
{
public static void main(String[] args)
  {
      int n = 5;
      int result = fact(n);
      System.out.println(result);
  }
  public static int fact(int n)
  {
    int fact = 1;
    while(n>1)
    {
    fact *= n--;   
  }
  return fact;
 }
}