import java.util.Scanner;
class Main
{
    public static void main(String[] args) 
    {
        int arr_size,sum;
        Scanner sc = new Scanner(System.in);
        arr_size = sc.nextInt();
        int arr[] = new int[arr_size];
        for (int index = 0; index < arr_size; index++) 
        {
            arr[index] = sc.nextInt();
        }
      int value=sc.nextInt();
      
      for(int i=0;i<arr_size-2;i++)
      {
        for(int j=1;j<arr_size;j++)
        {
          sum=arr[i]+arr[j];
          if(sum==value)
          {
            System.out.println(arr[i]+", "+arr[j]);
          }
          
        }
      }
    }
}