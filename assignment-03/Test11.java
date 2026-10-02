import java.util.Scanner;
class Test11
{
    double width;
    double height;
    double depth;
    Test11(double width, double height, double depth)
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume()
    {
        return width * height * depth;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the box:");
        double width = sc.nextDouble();
        System.out.println("Enter the height of the box:");
        double height = sc.nextDouble();
        System.out.println("Enter the depth of the box:");
        double depth = sc.nextDouble();
        Test11 ob = new Test11(width, height, depth);
        System.out.println("Volume of the box = " + ob.volume());
        sc.close();
    }
}