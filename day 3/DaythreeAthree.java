import java.util.*;
class DaythreeAthree
{
public static void main(String args[])
{
int a;
double b;
double c;


System.out.println("Dear user, enter the number:");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();

b = a%5;
c = a%11;


if(b ==0)
{
System.out.println("no is divisible by 5");
}
else if (c == 0)
{
System.out.println("no is not divisible by 11 ");

}
else{
System.out.println("no is not divisble by 5 and 11");
}



}




}