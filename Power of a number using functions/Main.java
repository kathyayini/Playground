import java.util.Scanner;
class Main
{
  public static int power(int bas,int exp)
  {
    int res1=1;
    for(int i=1;i<=exp;i++)
    {
      res1=res1*bas;
    }
    return res1;
  }
public static void main(String args[])
{
  Scanner in=new Scanner(System.in);
  int a=in.nextInt();
  int b=in.nextInt();
  int res=power(a,b);
  System.out.print(res);
}
}