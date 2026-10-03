import java.util.Scanner;
class Test27
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        System.out.println("Enter n:");
        int n=sc.nextInt();
        String firstTwo=s.substring(0,2);
        String result="";
        for(int i=0;i<n;i++)
        {
            result=result+firstTwo;
        }
        System.out.println("Result: "+result);
        sc.close();
    }
}