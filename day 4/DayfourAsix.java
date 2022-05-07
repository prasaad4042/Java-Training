import java.util.Scanner;
class DayfourAsix
{
public static void main(String args[])
{
String s;
int n;
char b;
Scanner sc = new Scanner(System.in);
System.out.println("Dear user, enter the word: ");
s = sc.next();

n = s.length();


int i = 0;
while (i<=n-1)
{
b = s.charAt(i);
System.out.println(b);
i = i+1;
}
}



}