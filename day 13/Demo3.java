import java.util.Scanner;
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int a,b,c;
        System.out.println("enter two numbers");

        try{
            a = sc.nextInt();
            b = sc.nextInt();
            c = a/b;
            System.out.println("division is: "+c);

        } catch(ArithmeticException|InputMismatchException e){
            //System.out.println(e);

            if(e instanceof ArithmeticException)
            {
                System.out.println("cannot divide by zero");
            }
            else if(e instanceof InputMismatchException)
            {
                System.out.println("please enter int value:");

            }

        } 
        System.out.println("end");
    }

    
}
