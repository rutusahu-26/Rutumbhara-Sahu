interface NumberPrinter
{
    void printNumber(int num);
}
class NP implements NumberPrinter
{
    public void printNumber(int num)
    {
        System.out.println("Value of number is "+num);
    }
}
class Test22
{
    public static void main(String args[])
    {
        NumberPrinter ob=new NP();
        ob.printNumber(100);
    }
}