import java.util.HashSet;
import java.util.Scanner;
class Student
{
    int id;
    String name;
    Student(int a, String b)
    {
        id = a;
        name = b;

    }
//overriding toString method
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "("+id+","+name+")";
    }


  // overriding hashcode method
    @Override
    public int hashCode() {
        int code;
        code = name.hashCode()+id;
        code = code%10;
        return code;
    }
// overriding equal methodd
    @Override
    public boolean equals(Object obj) {
        boolean f = false;
        Student st = (Student)obj;
        if(id == st.id && name.equals(st.name))
        {
            f = true;

        }
        return f;
    }
}
public class Demo1
{
    public static void main(String[] args) {

        HashSet <Student> hs;
        hs = new HashSet<>();

        Student st1 = new Student(1,"a");
        Student st2 = new Student(1, "a");
        hs.add(st1);
        hs.add(st2);
        System.out.println(hs);
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());



    }
}
