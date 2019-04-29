import java.util.Scanner;
class Main{
  public static int gcdo(int num1,int num2)
  {
    int min=0,gc=0;
    if(num1<num2)
    {
     min=num1;
    }
    else
      min=num2;
    while(min>=1)
    {
      if((num1%min==0)&&(num2%min==0))
      {
        gc= min;
        break;
      }
      --min;
    }
    return gc;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int result = gcdo(n1,n2);
      System.out.print(gcdo(result,n3));
	}
}