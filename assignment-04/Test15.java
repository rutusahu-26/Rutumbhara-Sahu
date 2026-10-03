class Person
{
    String name;
    Person()
    {
        name="Sibo Prasad Patro";
    }
    public void getName()
    {
        System.out.println("Name: "+name);
    }
}
class Employee extends Person
{
    double annualSalary;
    int yearStarted;
    String nationalInsuranceNumber;
    Employee(double annualSalary,int yearStarted,String nationalInsuranceNumber)
    {
        this.annualSalary=annualSalary;
        this.yearStarted=yearStarted;
        this.nationalInsuranceNumber=nationalInsuranceNumber;
    }
}
class Test15
{
    public static void main(String args[])
    {
        Employee e=new Employee(60000,2024,"NI12345");
        e.getName();
        System.out.println("Annual Salary: "+e.annualSalary);
        System.out.println("Year Started: "+e.yearStarted);
        System.out.println("National Insurance Number: "+e.nationalInsuranceNumber);
    }
}