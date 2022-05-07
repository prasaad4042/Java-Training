

import java.util.Scanner;

class Assonenumfive{
public static void main(String args[])
{
float a;
float hra;
float da;
float da1;
float hra1;
double grosssal;

System.out.println("Dear user, enter your basic salary");
Scanner bsal = new Scanner(System.in);
a = bsal.nextInt();
hra = a*20;
hra1 = hra/100;

da = a*80;
da1 = da/100;

grosssal = hra1 + da1 + a;
System.out.println("your gross salary is: "+grosssal);

}


}