class Person
{
    String name;
    String dateOfBirth;
    Person(String n,String d)
    {
        name=n;
        dateOfBirth=d;
    }
    void display()
    {
        System.out.println(name+" "+dateOfBirth);
    }
}
class Teacher extends Person
{
    double salary;
    String subject;
    Teacher(String n,String d,double s,String sub)
    {
        super(n,d);
        salary=s;
        subject=sub;
    }
}
class Student extends Person
{
    int studentId;
    Student(String n,String d,int id)
    {
        super(n,d);
        studentId=id;
    }
}
class CollegeStudent extends Student
{
    String collegeName;
    String year;
    CollegeStudent(String n,String d,int id,String c,String y)
    {
        super(n,d,id);
        collegeName=c;
        year=y;
    }
}
class Test16
{
    public static void main(String args[])
    {
        Person p=new Person("Kriya","10-05-2006");
        Teacher t=new Teacher("Rahul","12-06-1985",50000,"Maths");
        Student s=new Student("Ankit","16-08-2007",10);
        CollegeStudent c=new CollegeStudent("Arya","20-03-2006",102,"GIET","2nd Year");
        p.display();
        t.display();
        System.out.println("Salary: "+t.salary);
        System.out.println("Subject: "+t.subject);
        s.display();
        System.out.println("Student ID: "+s.studentId);
        c.display();
        System.out.println("Student ID: "+c.studentId);
        System.out.println("College Name: "+c.collegeName);
        System.out.println("Year: "+c.year);
    }
}