import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int sum=0,rem=0;
      Scanner in=new Scanner(System.in);
      int n = in.nextInt();
      for(int i=1;i<=n;i++)
      {
        rem=n%10;
        sum=sum+rem;
        n=n/10;
      }
      System.out.println(sum);
	}
}