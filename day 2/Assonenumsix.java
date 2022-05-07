import java.util.Scanner;

class Assonenumsix
{

public static void main(String args[])
{
float a;
float b;
float c;

System.out.println(" Dear user, Enter two numbers to swap: ");
Scanner ab = new Scanner(System.in);
a = ab.nextFloat();
b = ab.nextFloat();

c = b;
b = a;
a = c;

System.out.println("numbers after swapping are as follows:  a is: "+a +" b is:"+b);
}


}