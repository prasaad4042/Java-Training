import java.util.Scanner;

class DaythreeAtwo
{

public static void main(String args[])
{
int a;
int b;
int c;

System.out.println("Dear user, enter the number:");
Scanner sc = new Scanner(System.in);

a = sc.nextInt();

if(a>0)
{
System.out.println("no is positive");
}
else if(a<0)
{
System.out.println("no is negative");

}
else if (a == 0){
System.out.println("no is zero");

}
}
}