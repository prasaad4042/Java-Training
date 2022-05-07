//INTERNET DELICATESSEN

import java.util.Scanner;
class DaythreeAnine
{
public static void main(String args[])
{
String itemname;
double price;
int expdelivery;
double expdeliverycharges = 3.0;
double total;
double regdelivery = 2.0;
double tdel;
Scanner sc = new Scanner(System.in);
System.out.println("enter product name, its price and enter 1 if you want experess delivery and if you do not want express delivery enter 0");
itemname = sc.next();
price = sc.nextDouble();
expdelivery = sc.nextInt();
if (price>=10)
{
   total = price;
   System.out.println("INVOICE");
   System.out.println(itemname+" " + price);
   System.out.println("total " + total);   
   
}


else
{
   if(expdelivery == 0)
   {
   total = price + regdelivery;
   System.out.println("INVOICE");
   System.out.println(itemname+" " + price);
   System.out.println("delivery charges " +regdelivery);
   System.out.println("total " + total); 
   
   
   }
   else
   {
   tdel = regdelivery + expdeliverycharges;
   total = price + regdelivery + expdeliverycharges;
   System.out.println("INVOICE");
   System.out.println(itemname+" " + price);
   System.out.println("delivery charges " +tdel);
   System.out.println("total " + total); 
   

   }
}
}
}