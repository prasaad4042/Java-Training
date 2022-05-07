import java.util.*;
class DaythreeAseven
{
public static void main(String args[])
{

int a;
int b;
int c;



System.out.println("Dear user, enter actual price and selling price: ");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();


if(a>b)
{
c = a-b;
System.out.println("dear user you have loss of "+c);
}

else{
c = b-a;
System.out.println("dear user you have profit of"+c);
}
}
}

