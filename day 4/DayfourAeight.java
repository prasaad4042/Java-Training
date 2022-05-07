import java.util.Scanner;
class DayfourAeight
{
public static void main(String args[])
{
int a;
Scanner sc = new Scanner(System.in);
System.out.println("dear user enter the number for which you want a multilication table: ");
a = sc.nextInt();
int i = 1;
while(i<=10)
{
System.out.println(a*i);
i = i+1;
}
}

}