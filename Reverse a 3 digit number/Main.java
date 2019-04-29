import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int sum =0,l;
    Scanner n= new Scanner(System.in);
    int a = n.nextInt();
  for(int i=0;i<3;i++)
  {
    l=a%10;
    sum=(sum*10)+l;
    a=a/10;
  }
    System.out.println(sum);
  }
}