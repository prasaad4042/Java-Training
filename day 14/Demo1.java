import java.FileInputStream;
import java.lang.Thread.State;


public class Demo1 {
Static void div1(){
    try{
        int a;
        a = 10/0;

    } catch(ArithmeticException e){
        System.out.println("cannot divie by zero");

    }finally{
        System.out.println("Always executed");

    }

}
static void div2()
{
    try {
        int a;
        a = 10/2;
        System.out.println("div is"+a);

    }catch(ArithmeticException e)
    {
        System.out.println("cannot divie by zero");
        
    }finally{
        System.out.println("Always executed");

    }

}
Static void div3(){
    try{
        return;

    }catch(ArithmeticException e)
    {
        System.out.println("cannot ddivide byzero");

    }finally{
        System.out.println("always executed");
    }
}
    
}
