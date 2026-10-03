import java.util.Scanner;
class Test26
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1=sc.nextLine();
        System.out.println("Enter second string:");
        String s2=sc.nextLine();
        String result=(s1+s2).toLowerCase();
        System.out.println("Result: "+result);
        sc.close();
    }
}