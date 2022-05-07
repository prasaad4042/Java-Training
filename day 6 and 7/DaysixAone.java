class Student
{
    String fname;
    String lname;
    int year;
    String major;

    Student(String a, String b, int c, String d)
    {
        this.fname = a;
        this.lname = b;
        this.year = c;
        this.major = d;


    }
    void display()
    {
        System.out.println("first name: "+fname);
        System.out.println("last name:"+lname);
        System.out.println("year:"+year);

        System.out.println("major is:"+major);
        
        


    }




}

class DaysixAone
{

    public static void main(String[] args)
    {
        Student s1 = new Student("Prasaad","Gade",401,"IOt");
        Student s2 = new Student("onkar","Gade",402,"IOt");
        
        
        s1.display();
        s2.display();
    }
    

}