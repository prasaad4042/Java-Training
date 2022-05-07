import java.util.Scanner;
class DayfourAten
{
public static void main(String args[])
{
int c = 1;
int d = 1;
int a;
int b;

Scanner sc = new Scanner(System.in);
System.out.println("Dear user, enter the value of N: ");
a = sc.nextInt();
System.out.println("Dear user, enter the power: ");
b = sc.nextInt();

int i = 1;
while (i<=b)
{
c = c*a;
i = i+1;
}
System.out.println(c);

for (i = 1; i<=b;i=i+1)
{
d = d*a;

}
System.out.println(d);


}
}