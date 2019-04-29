



import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int var=n;
      for(int i=1;i<=n;i++)
      {
        for(int j=var;j>=1;j--)
        {
          System.out.print(j);
        }
        var=var-1;
        System.out.println("");
      }
	}
}
