import java.util.Scanner;

class Asstwopro3
{

public static void main(String args[])
{
int a;
int b;
int c;
double d;
double g;
double k;
double m;
double n;
double y;
System.out.println("enter values of A, B and C:");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
g = b*b - 4 * a* c;

d = Math.sqrt(g);

k = - b + d;
n = -b -d;
m = k/ 2*a;
y = n / 2*a;

System.out.println("Dear user your entered expression is: "+a+"X^2+"+b+"x+"+c);
System.out.println(m);
System.out.println(y);
}

}