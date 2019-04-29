import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    int count=1;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for(int i=1;i<=n;i++)
    {
      System.out.print(i);
      if(i==3*count)
      {
        System.out.print(",");
        count=count+1;
      }
    }
    
  }
}