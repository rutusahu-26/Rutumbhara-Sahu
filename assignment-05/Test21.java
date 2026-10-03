interface Greeting
{
    void sayHello();
    default void sayBye()
    {
        System.out.println("Good bye");
    }
}
class MyGreeting implements Greeting
{
    public void sayHello()
    {
        System.out.println("Hello");
    }
}
class Test21
{
    public static void main(String args[])
    {
        MyGreeting ob=new MyGreeting();
        ob.sayHello();
        ob.sayBye();
    }
}