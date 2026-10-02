import java.util.Scanner;
class Test12
{
    static int add(int x,int y)
    {
        return x+y;
    }
    static int subtract(int x,int y)
    {
        return x-y;
    }
    static int multiply(int x,int y)
    {
        return x*y;
    }
    static int divide(int x,int y)
    {
        return x/y;
    }
    static double power(double x,double y)
    {
        return Math.pow(x,y);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        double x1,y1;
        System.out.println("Enter two integers:");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Addition = "+add(x,y));
        System.out.println("Subtraction = "+subtract(x,y));
        System.out.println("Multiplication = "+multiply(x,y));
        System.out.println("Division = "+divide(x,y));
        System.out.println("Enter two numbers for power:");
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        System.out.println("Power = "+power(x1,y1));
        sc.close();
    }
}