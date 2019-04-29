import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int i=1,var;
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      for(i=1;i<=n;i++)
      {
        var=2*i;
        for(int s=1;s<=n-i;s++)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=var-1;j++)
        {
          System.out.print("*");
        }
        System.out.println("");
      }
	}
}