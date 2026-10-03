import java.util.Scanner;
class Test29
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        String result=s.substring(1,s.length()-1);
        System.out.println("Result: "+result);
        sc.close();
    }
}