class Test
{
    int i;
    static int j;
    
    static void show()
    {
      // we cannot use instance variable(i) inside static function (static void show()), we can only use static variable inside static method.
        
        System.out.println("hii user, how are you?");
    }
    void display()
    { i = i+1;
      j = j+1;
      System.out.println(i);
      System.out.println(j);

    
    
    }

}

public class Dayninestaticinstance
 
{
    public static void main(String[] args) 
    {
        Test t = new Test();
        Test.show();
        t.display();

        
    }



    
}
