package example;
abstract class employee
{
    String name;
    int age;
    int hourrate;
    employee(String n,int ho,int ag)
    {
        name=n;
        hourrate=ho;
        age=ag;
    }
    abstract double CalcSalary(double  hours);
    String tostring()
    {
        return "name:"+name+" age:"+age+" hourrate:"+hourrate;
    }
}
class clerk extends employee
{
    double clerksalary;
    clerk(String a,int b,int c)
    {
        super(a,b,c);
    }
    public double CalcSalary(double  hours)
    {
        clerksalary=hours*hourrate;
        return clerksalary;
    }
}
class manager extends employee
{
    double managersalary;
    manager(String a,int b,int c)
    {
        super(a,b,c);
    }
    @Override
    public double CalcSalary(double  hours)
    {
        managersalary=hours*hourrate;
        return managersalary;
    }
}
public class Sample
{
    public static void main(String[] args)
    {
        manager m1=new manager("jegan",12,18);
        System.out.println("total salary:"+m1.CalcSalary(20));
        System.out.println(m1.tostring());
        manager m2=new manager("kingsly",12,18);
        System.out.println("total salary:"+m2.CalcSalary(20));
        System.out.println(m2.tostring());
        clerk cle=new clerk("gowtham",10,19);
        System.out.println("total salary:"+cle.CalcSalary(18));
        System.out.println(cle.tostring());
    }
}