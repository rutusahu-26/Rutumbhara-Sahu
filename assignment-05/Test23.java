interface Printer
{
    void print();
}
interface Scanner
{
    void scan();
}
class Machine implements Printer,Scanner
{
    public void print()
    {
        System.out.println("Printing document");
    }
    public void scan()
    {
        System.out.println("Scanning document");
    }
}
class Test23
{
    public static void main(String args[])
    {
        Machine ob=new Machine();
        ob.print();
        ob.scan();
    }
}