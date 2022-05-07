package util;
import util.Person;

public class Employee extends Person

{
    double sal;
    int year;
    String number;
    Employee(double a, int b, String c, String d)
    {
        this.sal = a;
        this.year = b;
        this.number = c;
        this.name =d;

        System.out.println("salary of employee is:"+sal);
        System.out.println("year when employee started to work is:"+year);
        System.out.println("employee number is:"+c);
        System.out.println("name of employe is:"+name);



    }
}
