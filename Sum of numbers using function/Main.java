import java.util.Scanner;
class Main{
  public static int sum(int num)
  {
    int count=0;
    if(num%2!=0)
    {
    for(int i=1;i<=num;i++)
    {
      if(i%2!=0)
      {
        count=count+1;
      }
    }
    }
    else
    {
      for(int j=1;j<=num;j++)
    {
      if(j%2==0)
      {
        count=count+1;
      }
    }
      num=num+1;
    }
    int sum1=num*count;
    return sum1;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum2=sum(n);
      System.out.println(sum2);
      
	}
}