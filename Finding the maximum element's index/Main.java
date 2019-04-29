import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
  int n=in.nextInt();
  int list[];
  list=new int[n];
  for(int i=0;i<n;i++)
  {
    list[i]=in.nextInt();
  }
   System.out.print(print_lar(list,n));
  }
  public static int print_lar(int list[],int n)
  {
    int index =0,lar =list[0];
    for(int i=0;i< n;i++)
    {
      if(lar<list[i])
      {
        lar=list[i];
        index=i;
      }
      
    }
  return index;
  }
}