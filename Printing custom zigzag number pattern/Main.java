import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int m=n;
      for(int i=1;i<=n;i++)
      {
        if(i%2==1)
        {
          for(int j=1;j<=n;j++)
          {
            if(j<n)
              System.out.print(i);
            else
              System.out.print(i+1);
          }
        }
        else 
        {
          for(int j=m;j>=1;j--)
          {
            if(j==m)
              System.out.print(i+1);
            else
              System.out.print(i);
          }
        }
        System.out.println("");
      }
	}
}
