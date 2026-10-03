import java.util.Scanner;
class Test30
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        System.out.println("Enter n:");
        int n=sc.nextInt();
        String last=s.substring(s.length()-n);
        String result="";
        for(int i=0;i<n;i++)
        {
            result=result+last;
        }
        System.out.println("Result: "+result);
        sc.close();
    }
}