import java.util.Scanner;
class Main {
	public static void main (String[] args) {
      int a, b ,c;
		Scanner in = new Scanner(System.in);
		// Type your code here
      int year = in.nextInt();
      a=year%4;
      b=year%100;
      c=year%400;
      if(a==0)
      {
        if(b==0)
        {
          if(c==0)
          {
            System.out.println("Leap year");
          }
          else{
            System.out.println("Non Leap year");
          }
        }
        else
          System.out.println("Leap year");
      }
      else
        System.out.println("Non Leap year");
        
    }
}