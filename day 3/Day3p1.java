import java.util.Scanner;

class Day3p1
{

public static void main(String args[])
{
String name;
int age;
System.out.println("Name and age:");
Scanner sc = new Scanner(System.in);
name = sc.next();
age = sc.nextInt();
if(age>18)
{
System.out.println("vote");
}
else
{
System.out.println("can not vote");
}
}
}