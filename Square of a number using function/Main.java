import java.util.Scanner;
class Main
{
  public static int sq(int num)
  {
    int sq1 =num*num;
    return sq1;
  }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int result= sq(n);
      System.out.println(result);
	} 
}