class Fruit
{
    String name;
    String taste;
    String size;
    Fruit(String n,String t,String s)
    {
        name=n;
        taste=t;
        size=s;
    }
    void eat()
    {
        System.out.println(name+" tastes "+taste);
    }
}
class Apple extends Fruit
{
    Apple(String n,String t,String s)
    {
        super(n,t,s);
    }
    void eat()
    {
        System.out.println("Apple tastes sweet");
    }
}
class Orange extends Fruit
{
    Orange(String n,String t,String s)
    {
        super(n,t,s);
    }
    void eat()
    {
        System.out.println("Orange tastes sour");
    }
}
class Test17
{
    public static void main(String args[])
    {
        Fruit a=new Apple("Apple","Sweet","Medium");
        Fruit o=new Orange("Orange","Sour","Medium");
        a.eat();
        o.eat();
    }
}