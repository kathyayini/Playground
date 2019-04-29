import java.util.Scanner;
class Main { 
	public static void main(String[] args){
      int fl=0;
  		Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          if(fl==0)
          {
            System.out.print("*");
            fl=1;
          }
          else{
            System.out.print("#");
            fl=0;
          }
        }
        System.out.println("");
      }
    }
}