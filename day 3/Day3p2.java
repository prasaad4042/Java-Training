import java.util.Scanner;

class Day3A1
{

public static void main(String args[])
{
int a;
int b;
int c;

System.out.println("Dear user, enter three numbers:");
Scanner sc = new Scanner(System.in);

a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
if(a>b && a>c)
{
System.out.println("max no is:"+a);
}
else if(b>a && b>c)
{
System.out.println("max no is:"+b);

}
else if (c>a && c>b){
System.out.println("max no is:"+c);

}
}
}