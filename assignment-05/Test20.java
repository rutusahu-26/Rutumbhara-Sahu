interface Shape
{
    void draw();
}
class Circle implements Shape
{
    public void draw()
    {
        System.out.println("Drawing circle");
    }
}
class Rectangle implements Shape
{
    public void draw()
    {
        System.out.println("Drawing rectangle");
    }
}
class Test20
{
    public static void main(String args[])
    {
        Shape ob;
        ob=new Circle();
        ob.draw();
        ob=new Rectangle();
        ob.draw();
    }
}