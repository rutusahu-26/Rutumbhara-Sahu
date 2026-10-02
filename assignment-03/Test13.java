class Author
{
    String name;
    String email;
    char gender;
    Author(String name,String email,char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
}
class Book
{
    String name;
    Author author;
    double price;
    int qtyInStock;
    Book(String name,Author author,double price,int qtyInStock)
    {
        this.name=name;
        this.author=author;
        this.price=price;
        this.qtyInStock=qtyInStock;
    }
    String getName()
    {
        return name;
    }
    Author getAuthor()
    {
        return author;
    }
    double getPrice()
    {
        return price;
    }
    int getQtyInStock()
    {
        return qtyInStock;
    }
}
class Test13
{
    public static void main(String args[])
    {
        Author a=new Author("R. K. Narayan","rk@gmail.com",'M');
        Book b=new Book("Malgudi Days",a,450,10);
        System.out.println("Book Name = "+b.getName());
        System.out.println("Author Name = "+b.getAuthor().name);
        System.out.println("Author Email = "+b.getAuthor().email);
        System.out.println("Author Gender = "+b.getAuthor().gender);
        System.out.println("Price = "+b.getPrice());
        System.out.println("Quantity in Stock = "+b.getQtyInStock());
    }
}