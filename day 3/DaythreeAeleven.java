                  //Fantasy Game

import java.util.Scanner;
class DaythreeAtwelve
{
public static void main(String aregs[])
{
String name;
int a;
int b;
int c;

Scanner sc = new Scanner(System.in);
System.out.println("enter the name of character:");
name = sc.next();
System.out.println("enter the strength,health and luck of character");
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
if (a+b+c <= 15)
{
System.out.println("character name: "+name +"  strength: "+a+ " health: "+b + " luck: "+c);
}
else
{

System.out.println("you have given too many values to your character so default values arre given as Strength: 5 health: 5 luck: 5");
}
}




}