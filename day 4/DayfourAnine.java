import java.util.Scanner;
class DayfourAnine
{
public static void main(String args[])
{
int a = 0;
int b = 0;
int c = 0;
int d = 0;

int n;
Scanner sc = new Scanner(System.in);
System.out.println("Dear user, enter the number: ");
n = sc.nextInt();
int i = 2;
while (i<=n/2)
{

if(n%i == 0)
{
a = a+1;
}
else
{
b = b+1;
}
i = i+1;
}

if(a>=1)
{
System.out.println("entered no is not a prime no");
}
else
{
System.out.println("entered no is prime no");
}





for (i = 2;i<=n/2;i = i+1)
{

if(n%i == 0)
{
c = c+1;
}
else
{
d = d+1;
}
}
if(c>=1)
{
System.out.println("entered no is not a prime no");
}
else
{
System.out.println("entered no is prime no");
}










}



}