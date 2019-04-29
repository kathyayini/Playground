import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int s,l;
      Scanner n=new Scanner(System.in);
      int a=n.nextInt();
      s=a%100;
      l=s/10;
      System.out.println(l);
	}
}