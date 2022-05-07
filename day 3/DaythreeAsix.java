import java.util.*;
class DaythreeAsix
{
public static void main(String args[])
{

int a;
int b;
int c;



System.out.println("Dear user, enter three angles: ");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();





if(a+b+c == 180)
{
System.out.println("valid triangle");
}

else{
System.out.println("not valid triangle");
}
}
}

