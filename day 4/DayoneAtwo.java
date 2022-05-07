import java.util.Scanner;
class DayoneAtwo
{
public static void main(String args[])
{
int sum = 0;
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Dear user, enter the value of N: ");
n = sc.nextInt();
int i = 1;
while (i<=n)
{
sum = sum + i;
i = i+1;
}
System.out.println(sum);
}



}