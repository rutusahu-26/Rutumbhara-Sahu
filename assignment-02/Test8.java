import java.util.Arrays;

class Test8
{
    public static void main(String args[])
    {
        int arr[] = {25, 10, 40, 5, 30, 15};
        Arrays.sort(arr);
        System.out.println("Smallest 2 numbers are:");
        System.out.println(arr[0] + " " + arr[1]);
        System.out.println("Largest 2 numbers are:");
        System.out.println(arr[arr.length - 2] + " " + arr[arr.length - 1]);
    }
}