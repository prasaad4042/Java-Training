import java.util.*;
class DaythreeAfour
{
public static void main(String args[])
{
int a;


System.out.println("Dear user, enter the year:");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();


if(a%4 == 0)
{
System.out.println("year is leap year");
}

else{
System.out.println("year is not leap year");
}
}
}


