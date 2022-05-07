class A
{   int i;
    
    A()
    {
        i = 10;
        System.out.println("In A");
    }

}

class B extends A

{
    int i;
    B()
    {
        i = 20;
        System.out.println("In B");
        System.out.println(i+i);
        System.out.println(super.i + i);
        System.out.println(super.i + super.i);

    }

}


public class Daynineinheritence
 {
     public static void main(String[] args) 
     {
         B e = new B();
         
         
     }
    
}
