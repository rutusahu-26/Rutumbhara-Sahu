import java.util.Scanner;

class Test6
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
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < 5; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }

            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum is " + max);
        System.out.println("Minimum is " + min);
        sc.close();
    }
}