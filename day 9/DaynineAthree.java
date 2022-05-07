class Person
{
    String name="prasaad";
    int age= 22;
    }

class Student extends Person
{String division= "eleventh";
int number = 556;


}

class Teacher extends Person
{
    int salary;
    String subject;
    Teacher(int m, String k)
    {
        this.salary = m;
        this.subject = k;
        System.out.println("salary of teacher is :"+salary);
        System.out.println("subject which teacher teach is:"+subject);
        System.out.println("name of student is :"+name);
        System.out.println("age of person is:"+age);





    }
}

class CollegeStudent extends Student
{
    int currentyear;
    String major;

    CollegeStudent(int a, String b)

    {   this.currentyear = a;
        this.major = b;
        System.out.println("current year of student is; "+currentyear);
        System.out.println("major subjet of student is:"+major);
        System.out.println("division of student is:"+division);

        System.out.println("class number of student is:"+number);

        

    }
}

class DaynineAthree
{
    public static void main(String[] args) {
        System.out.println("******************************");

        System.out.println("calling the teacher");
        Teacher t = new Teacher(9000,"computer science");
        System.out.println("******************************");
        
        
        System.out.println("******************************");
        System.out.println("calling the student");
        CollegeStudent c = new CollegeStudent(12, "mathematics");
        System.out.println("******************************");

        
    }
}
