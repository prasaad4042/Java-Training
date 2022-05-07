

class Student
{
    String name;
    int sub1;
    int sub2;
    int sub3;
    float total;
    float average;
    void Student(String n, int a, int b, int c)
    {
        this.name = n;
        this.sub1 = a;
        this.sub2 = b;
        this.sub3 = c;


    }

     void Display()
    {
        System.out.println("name of student is "+name);
        total = sub1 + sub2 + sub3;
        average = total/3;
        System.out.println("average marks are: "+average);

    }
}




public class DayeightAseven 
{

    public static void main(String[] args) 
    {   
        Student st1 = new Student();
        Student st2 = new Student();
        st1.Student("prasaad",100,99,100);
        st2.Student("onkar",75,78,74);
        st1.Display();
        st2.Display();




        
    }
    
}
