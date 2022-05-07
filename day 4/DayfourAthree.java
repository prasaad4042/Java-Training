import java.util.Scanner;
class DayfourAthree
{
public static void main(String args[])
{
int sum = 0;
int n;
int m;

Scanner sc = new Scanner(System.in);
System.out.println("Dear user, enter the low value : ");
n = sc.nextInt();
System.out.println("Dear user, enter the high value : ");
m = sc.nextInt();
int i = n;
while (i<=m)
{
sum = sum + i;
i = i+1;
}
System.out.println(sum);



}


}