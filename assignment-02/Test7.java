import java.util.Scanner;
class Test7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 elements:");
        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0; i < 5; i++)
        {
            if(arr[i] == n)
            {
                count++;
            }
        }

        if(count > 0)
        	{
           		 System.out.println("Given number exists");
        }
        else
        	{
           		 System.out.println("Given number does not exist");
        }

        sc.close();
    }
}