import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=0,a=1,m=1,b=1,c,x=n;
      while(x>1)
      {
        x=x/10;
        count=count+1;
      }
      for(int i=1;i<=count-1;i++)
      {
        m=m*10;
      }
      a=n/m;
      b=n%10;
      c=a+b;
  System.out.print(c);
}
}