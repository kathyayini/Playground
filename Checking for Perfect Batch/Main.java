import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner in=new Scanner(System.in);
  int n=in.nextInt();
  int list[];
  list=new int[n];
  for(int i=0;i<n;i++)
  {
    list[i]=in.nextInt();
  }
    if(print_ele(list,n))
    {
      System.out.print("Perfect Batch");
    }
    else
      System.out.print("Not a Perfect Batch");
}
  public static boolean print_ele(int list[],int n)
  {
    int sum1=0,sum2=0,l=n;
    boolean is_per=false;
    sum1=list[0]+list[1]+list[2];
  for(int i=3;i<n-3;i=i+3)
  {
    if(list[i]+list[i+1]+list[i+2]==sum1)
      is_per=true;
    else 
      is_per=false;
  }
    return is_per;
}
}