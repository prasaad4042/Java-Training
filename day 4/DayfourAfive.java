import java.util.Scanner;
class DayfourAfive
{
public static void main(String args[])
{
String s;
String k;
int a,b;
int c;
int d;

Scanner sc = new Scanner(System.in);
System.out.println("Dear user, enter the firt string: ");
s = sc.next();
System.out.println("Dear user, enter the second string: ");
k = sc.next();
a = s.length();
b = k.length();
c = a+b;
d = 30 - c;
System.out.print(s);
int i = 1;
while (i<d)
{
System.out.print(".");
i = i+1;
}
System.out.print(k);
}



}